package Inheritance;

public class MyAnimal {
    // Parent class or Super class
    // when you create object for the child,
    // the parent non parameterized constructor is called first
    public MyAnimal(){
        System.out.println("Animal Constructor non parameterized");
    }
    public MyAnimal(int age){
        
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("Animal might walk");
    }
       
}
class Human extends MyAnimal{
    public void talk(){
        System.out.println("Human talks");
    }
    // when parent and child have same method,the method from child is called
    public void walk(){
        // super refers to the attributes and methods of immediate parent
        super.walk();
        System.out.println("Human walks");
    }
}
// multi level inheritance -- one parnet can have multiple child classes
// Parent MyAnimal has Human and Snake.

class Snake extends MyAnimal{
    public void hiss(){
        System.out.println("Snake hisses");
    }
    public void walk(){
        System.out.println("Snake crawls");
    }
}

// hierarchial inheritance -- inheritances i levels
// MyAnimal is the parent of Snake. Snake is the parnet of Cobra.
class Cobra extends Snake{
    public void isDangerous(){
        System.out.println("Cobra is dangerous");
    }
}
class Bird extends MyAnimal{
    public void eat(){
        System.out.println("Bird eats");
    }
    public void fly(){
        System.out.println("Bird can fly");
    }

}
class Ostrich extends Bird{
    public void fly(){
        System.out.println("Ostrich can't fly");
    }
    public void greet(){
        System.out.println("Ostrich greets");
    }
}
class Egale extends Bird{
    public void greet(){
        System.out.println("Egale greets");
    }
}


class InheritanceExample{
     public static void main(String[] args) {
        Human human1 = new Human();
        human1.talk();
        human1.eat();
        human1.walk();
        MyAnimal animal1= new MyAnimal();
        animal1.eat();
        animal1.walk();
    }

}