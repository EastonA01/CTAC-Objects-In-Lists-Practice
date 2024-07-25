package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private final String name;
    private final boolean isDog;

    // Constructor
    public Animal(String dogName, boolean dog) {
        this.name = dogName;
        isDog = dog;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<Animal>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");
        while(true){
            System.out.println("Please enter a name: ");
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String response = sc.nextLine().toLowerCase();
            if (response.equals("yes")) {
                // Create new animal
                list.add(new Animal(name, true));
            }
            else if (response.equals("no")) {
                list.add(new Animal(name, false));
            }
        }
        for (Animal a : list) {
            System.out.println(a.getName() + " is a dog = " + a.isDog());
        }
    }
}
