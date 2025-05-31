package Encapsulation;

public class Student {
    // student information
    private int studentId;
    private String studentName;
    private float averageGrade;
    // constructor since we need to set values in future
    public Student(float gpa){
        if(gpa>0){
        this.averageGrade=gpa;
    }else{
        System.out.println("GPA should be positive");
    }
}
    // getter and setter
    public int getStudentID(){
        return studentId;
    }
    public void setStudentID(int id){
        this.studentId=id;

    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        this.studentName=name;
    }
    // getter method for GPA
    public float getAverageGrade(){
        return averageGrade;
    }
    public static void main(String[] args) {
        Student obj =  new Student(3.62f);
        // setter for name and id
        obj.setStudentID(1010);
        obj.setStudentName("Rita");

        // accessing these
        System.out.println("The student with id "+ obj.getStudentID() + " namely "+ obj.getStudentName()+" has scored with GPA of "+ obj.getAverageGrade());
    }

    
}
