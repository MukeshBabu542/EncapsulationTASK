package Encapsulation;

public class UpdatedEmployee {
    // private variables
    private String employeeName;
    private int employeeID;
    private double salary;
    // constructor for salary
    public UpdatedEmployee(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("cannot be less than 0");
        }
    }
    // getter and setter for id and name
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String name){
        this.employeeName=name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int id){
        this.employeeID=id;
    }
    // specific method for salary
    public void adjustSalary(double amount) {
        if (salary + amount < 0) {
            System.out.println("Salary must be greater than 0.");
        } else {
            salary += amount;
            System.out.println("Salary updated. New salary: Rs." + salary);
        }
    }
    public static void main(String[] args) {
        UpdatedEmployee  obj = new UpdatedEmployee(4000);
        obj.setEmployeeID(101);
        obj.setEmployeeName("Rina Rai");
         System.out.println("The employee id is : "+obj.getEmployeeID());
          System.out.println("The employee name is : "+obj.getEmployeeName());
           System.out.println("The employee initial salary  is : "+obj.salary);
        //    after updation
        obj.adjustSalary(200);
        // negavite salary updation
        obj.adjustSalary(-6000);
    }
}
