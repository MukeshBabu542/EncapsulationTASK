package Encapsulation;

public class Employee {
    private String name;
    private String job_title;
    private String salary;
    //setter
    public void setName(String name) {
        this.name=name;
    }
    public void setJob(String job){
        this.job_title=job;
    }
    public void setSalary(String salary){
        this.salary=salary;
    }
    // getter
    public String getName(){
        return name;
    }
    public String getJob(){
        return job_title;
    }
    public String getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        Employee obj1= new Employee();
        obj1.setJob("HR");
        obj1.setName("Rita");
        obj1.setSalary("40000");
        System.out.println("Employee Details:");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Job Title: " + obj1.getJob());
        System.out.println("Initial Salary: $" + obj1.getSalary());
        // updating
        // Employee obj2 =  new Employee();
        obj1.setJob("Manager");
        obj1.setName("Ram");
        obj1.setSalary("50000");
        // displaying updated employees
        System.out.println("Employee Details:");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Job Title: " + obj1.getJob());
        System.out.println("Initial Salary: $" + obj1.getSalary());

    }
}
