package OOP;

// accessModifier class ClassName{
//Class Body
//}
// private -- only accessible to class: Personal Diary
// default-- only accessible to package: Group Chat
// protected -- only accessible to package and subclasses -- family home
// public -- accessible to all -- Census Data

public class Laptop {
    private String color;
    private String model;
    private double price;

    // accessModifier returnType nethodName(Parameter){
    //}
    // accessModifier ClassName(Parameter){
    //}
    // public Laptop(){
    //} 

    // Non Parameterized

    public Laptop(){
        System.out.println("Constructor called");
    }

    // Parameterized
    public Laptop(String model){
        System.out.println("Constructor with model"+model);
    }

    public Laptop(double price){
        System.out.println("Constructor with price"+price);
    }
    public Laptop(String model, String color, double  price){
        this.color=color;
        this.price=price;
        this.model=model;
        System.out.println("All values set bu constructor");

    }



    public void setModel(String model){
        this.model=model;
    }

    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(Double price){
        this.price=price;
    }

    public String getModel(){
        return model;
    }
    public Double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }

    public void openApp(){
        System.out.println(model+"opened app.");
    }
    public void closeApp(){
        System.out.println(model+"closed app");
    }
}
class LaptopDriver{
    public static void main(String[] args) {
        int a;
        Laptop lenovo = new Laptop();
        Laptop hp = new Laptop("hp");
        Laptop dell = new Laptop(100000.3);
        Laptop asus = new Laptop("asus","black",80000.2);
        // Laptop mac = new Laptop("mac","white");
        // error because constructor is not found for given parameters

        
        
        // lenovo.model="lenovo";
        // System.out.println(lenovo.model);
        lenovo.setModel("lenovo");
        String val= lenovo.getModel();
        System.out.println(val);
        lenovo.openApp();

    }
}

//identity -- name : lenovo
//properties -- attributes/variable : color,model,price
//behaviors -- method : openApp, closeApp
