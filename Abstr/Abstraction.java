package Abstr;

// process of hiding implementation details and showing only functionality
// to the users
// 1. Abstract Class: 0% to 100% abstraction
// 2. Interface: 100% abstraction

// abstract keyword is used to create aabstract class and abstract methods

abstract class Furniture{
// cannot create object -- cannot be instantiated

    public Furniture(){
        System.out.println("Furniture called ");
    }

    void greet(){
        System.out.println("Hello");
    }
    abstract void printName();
}
class Closet extends Furniture{

    public Closet(){
        System.out.println("Closet called ");
    }

    @Override
    void printName() {
        System.out.println("closet");
    }

}

// niterface does not support canstructor

interface Furniture1{
    // final attributes -- constant
    // abstract methods
    void printLength();
}
interface Box extends Furniture1 {
    void printVolume();
}

class MyCloset implements Box{

    @Override
    public void printLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
public class Abstraction {
    public static void main(String[] args) {
        // Furniture furniture = new Furniture(); -- error
        Closet closet = new Closet();
        closet.greet();
        closet.printName();    
    }
}

