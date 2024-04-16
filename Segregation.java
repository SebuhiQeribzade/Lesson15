package Lesson15;
// Interfaces
interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

interface Walk {
    void walk();
}

// Classes implementing interfaces
class Person implements Swim, Walk {
    @Override
    public void swim() {
        System.out.println("Person is swimming.");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking.");
    }
}

class Duck implements Swim, Fly, Walk {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Duck duck = new Duck();

        person.swim();
        person.walk();

        duck.swim();
        duck.fly();
        duck.walk();
    }
}
