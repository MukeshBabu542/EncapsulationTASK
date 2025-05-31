package OOP;

public class Citizen {
    // Private attributes
    private String name;
    private String citizenNumber;
    private int age;
    // Public methods
    public Citizen(String name, String citizenNumber, int age){
        this.name=name;
        this.citizenNumber=citizenNumber;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCitizenNumber(String citizennumber){
        this.citizenNumber=citizennumber;

    }
    public void setAge(int age){
        this.age=age;

    }

    public String getName(){
        return name;
    }
    public String getCitizenNumber(){
        return citizenNumber;
    }
    public int getAge(){
        return age;
    }

    
}

class CitizenImp{
    public static void main(String[] args) {
        Citizen citizen1= new Citizen("Nimesh", "N8212312", 20);
        System.out.println(citizen1.getName());
        // To change the name
        citizen1.setName("Suresh");

    }
}
