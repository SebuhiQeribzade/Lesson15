package Lesson15;
// Abstract Class and Subclasses

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Concrete implementation of calculateArea() for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    // Concrete implementation of calculateArea() for Square
    @Override
    double calculateArea() {
        return side * side;
    }
}

// Interface and Implementation

// Interface Resizable
interface Resizable {
    void resize();
}

// Class ResizableRectangle implementing Resizable
class ResizableRectangle implements Resizable {
    // Concrete implementation of resize() method
    @Override
    public void resize() {
        System.out.println("ResizableRectangle is being resized.");
    }
}

// Main class to test both tasks
public class Main {
    public static void main(String[] args) {
        // Testing Abstract Class and Subclasses
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());

        // Testing Interface Implementation
        ResizableRectangle resizableRectangle = new ResizableRectangle();
        resizableRectangle.resize();
    }
}
