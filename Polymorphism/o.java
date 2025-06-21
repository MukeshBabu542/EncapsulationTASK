package Polymorphism;

// 1. Shape Drawing Application using Polymorphism
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double calculateArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    double calculateArea() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) { this.base = base; this.height = height; }
    double calculateArea() { return 0.5 * base * height; }
}

// 2. E-commerce Payment System using Polymorphism
abstract class PaymentMethod {
    abstract void validate();
    abstract void processTransaction();
}

class CreditCard extends PaymentMethod {
    void validate() { System.out.println("Validating credit card..."); }
    void processTransaction() { System.out.println("Processing credit card payment"); }
}

class PayPal extends PaymentMethod {
    void validate() { System.out.println("Validating PayPal..."); }
    void processTransaction() { System.out.println("Processing PayPal payment"); }
}

class BankTransfer extends PaymentMethod {
    void validate() { System.out.println("Validating bank account..."); }
    void processTransaction() { System.out.println("Processing bank transfer"); }
}

// 3. Car Rental System using Polymorphism
abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) { return days * 50; }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) { return days * 30; }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) { return days * 10; }
}

// 4. Restaurant Ordering System
abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing appetizer..."); }
    void serve() { System.out.println("Serving appetizer"); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Preparing main course..."); }
    void serve() { System.out.println("Serving main course"); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Pouring beverage..."); }
    void serve() { System.out.println("Serving beverage"); }
}

// 5. Shape Manipulation Application
abstract class ManipulableShape {
    abstract void resize();
    abstract void rotate();
}

class Square extends ManipulableShape {
    void resize() { System.out.println("Resizing square"); }
    void rotate() { System.out.println("Rotating square"); }
}

// 6. Calculator Overloaded Methods
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

// 7. Geometry Area Overloaded Methods
class Geometry {
    double calculateArea(double radius) { return Math.PI * radius * radius; }
    double calculateArea(double length, double width) { return length * width; }
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

// 8. Payroll System
class Employee {
    double calculateSalary() { return 30000; }
}

class Manager extends Employee {
    double calculateSalary() { return super.calculateSalary() + 10000; }
}

// 9. Banking Application
class Account {
    double calculateInterest() { return 0; }
}

class SavingsAccount extends Account {
    double calculateInterest() { return 0.05; }
}

class FixedDepositAccount extends Account {
    double calculateInterest() { return 0.08; }
}

// 10. Game Character
class Character {
    void attack() { System.out.println("Character attacks"); }
}

class Warrior extends Character {
    void attack() { System.out.println("Warrior slashes"); }
}

class Mage extends Character {
    void attack() { System.out.println("Mage casts spell"); }
}

// 11. Music Application
abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() { System.out.println("Piano plays melody"); }
}

class Guitar extends Instrument {
    void playSound() { System.out.println("Guitar strums"); }
}

class Violin extends Instrument {
    void playSound() { System.out.println("Violin plays smooth tune"); }
}
