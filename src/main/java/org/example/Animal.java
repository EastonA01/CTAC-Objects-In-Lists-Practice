package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private final String name;
    private final boolean isDog;

    // Constructor with both parameters
    public Animal(String dogName, boolean dog) {
        this.name = dogName;
        isDog = dog;
    }

    // Overloaded constructor with only name; defaults to not a dog
    public Animal(String dogName) {
        this.name = dogName;
        this.isDog = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    // Main method to test constructors
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");
        while (true) {
            System.out.println("Please enter a name: ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                // Default when no name is entered
                break;
            } else {
                System.out.println("Is it a dog? Yes or no: ");
                String response = sc.nextLine().toLowerCase();
                if (response.equals("yes")) {
                    // Create new animal with name and isDog=true
                    list.add(new Animal(name, true));
                } else if (response.equals("no")) {
                    // Create new animal with name and isDog=false
                    list.add(new Animal(name, false));
                } else {
                    // Invalid response handling
                    System.out.println("Invalid input, assuming not a dog.");
                    list.add(new Animal(name));
                }
            }
        }

        // Display all animals
        for (Animal a : list) {
            System.out.println(a.getName() + " is a dog = " + a.isDog());
        }
    }
}
