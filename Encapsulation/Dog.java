package Encapsulation;

public class Dog {
    // parameterized constructor
   private String breed;
   private String name;

    Dog(String breed, String name){
      System.out.println("The breed is : "+breed + " name is " + name);
        this.breed=breed;
        this.name=name;
    }
    public void setBreed(String breed){
    this.breed=breed;

}
public void setName(String name){
    this.name=name;
}
public String getBreed (){
        return breed;
    }
    public String getName(){
        return name;
    }
    class DogData{
        public static void main(String[] args) {
            Dog dogObject1 = new Dog("husky","Max");
            
            // modifying using setters
            dogObject1.setBreed("German Sepherd");
            
            dogObject1.setName("Sidhhartha");
            
            
            System.out.println("udapted breed  :  "+dogObject1.getBreed());
            System.out.println("udapted name  :  "+dogObject1.getName());


        }
    }
    
}
