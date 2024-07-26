package org.example;

public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this.value = 0;
    }

    // Method to return the current value of the counter
    public int value() {
        return this.value;
    }

    // Method to increase the value by 1
    public void increase() {
        this.value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        this.value--;
    }

    // Overloaded method to increase the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Overloaded method to decrease the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {
        // Create a Counter object with a starting value of 10
        Counter counter1 = new Counter(10);
        System.out.println("Initial value of counter1: " + counter1.value());

        // Increase the counter1 value by 1
        counter1.increase();
        System.out.println("After increase by 1: " + counter1.value());

        // Decrease the counter1 value by 1
        counter1.decrease();
        System.out.println("After decrease by 1: " + counter1.value());

        // Increase the counter1 value by 5
        counter1.increase(5);
        System.out.println("After increase by 5: " + counter1.value());

        // Decrease the counter1 value by 3
        counter1.decrease(3);
        System.out.println("After decrease by 3: " + counter1.value());

        // Create a Counter object with the default starting value of 0
        Counter counter2 = new Counter();
        System.out.println("Initial value of counter2: " + counter2.value());

        // Increase the counter2 value by 10
        counter2.increase(10);
        System.out.println("After increase by 10: " + counter2.value());

        // Decrease the counter2 value by 2
        counter2.decrease(2);
        System.out.println("After decrease by 2: " + counter2.value());
    }
}