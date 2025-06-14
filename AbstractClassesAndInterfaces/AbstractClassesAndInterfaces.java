package AbstractClassesAndInterfaces;


    // 1. Bird Example
abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.println("Penguins can't fly but swim well.");
    }
}

// 2. Shape Area with Scanner

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 3. Vehicle
abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// 4. Shape with Area and Perimeter
abstract class AdvancedShape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class AdvCircle extends AdvancedShape {
    double radius;
    AdvCircle(double r) { radius = r; }
    double calculateArea() { return Math.PI * radius * radius; }
    double calculatePerimeter() { return 2 * Math.PI * radius; }
}

class AdvRectangle extends AdvancedShape {
    double l, w;
    AdvRectangle(double l, double w) { this.l = l; this.w = w; }
    double calculateArea() { return l * w; }
    double calculatePerimeter() { return 2 * (l + w); }
}

class Triangle extends AdvancedShape {
    double a, b, c, h;
    Triangle(double a, double b, double c, double h) {
        this.a = a; this.b = b; this.c = c; this.h = h;
    }
    double calculateArea() { return 0.5 * b * h; }
    double calculatePerimeter() { return a + b + c; }
}

// 5. 3D Draw
abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;
    Cube(double side) { this.side = side; }
    double calculateVolume() { return side * side * side; }
    double calculateArea() { return 6 * side * side; }
    double calculatePerimeter() { return 12 * side; }
}

class Cuboid extends Draw {
    double l, w, h;
    Cuboid(double l, double w, double h) { this.l = l; this.w = w; this.h = h; }
    double calculateVolume() { return l * w * h; }
    double calculateArea() { return 2 * (l*w + w*h + h*l); }
    double calculatePerimeter() { return 4 * (l + w + h); }
}

class Cylinder extends Draw {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    double calculateVolume() { return Math.PI * r * r * h; }
    double calculateArea() { return 2 * Math.PI * r * (r + h); }
    double calculatePerimeter() { return 2 * Math.PI * r; }
}

// 6. MediaPlayer + Playlist Interface
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() { System.out.println("Playing media"); }
    void pause() { System.out.println("Pausing media"); }
    void stop() { System.out.println("Stopping media"); }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void rewind() { System.out.println("Rewinding video"); }
    public void fastForward() { System.out.println("Fast forwarding video"); }
    public void addSong(String song) { System.out.println("Adding song: " + song); }
    public void removeSong(String song) { System.out.println("Removing song: " + song); }
}

// 7. Restaurant Management - Employee Interface
interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    public void work() { System.out.println("Chef is cooking"); }
    public double getSalary() { return 35000; }
}

class Waiter implements Employee {
    public void work() { System.out.println("Waiter is serving food"); }
    public double getSalary() { return 20000; }
}

// 8. Library Management - LibraryItem Interface
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;
    Book(String title, String author, int year, boolean available) {
        this.title = title; this.author = author; this.year = year; this.available = available;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
}


