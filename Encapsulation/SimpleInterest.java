package Encapsulation;

import java.util.Scanner;

public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;
    // setter
    public void setPrincipal(double p){
        this.principal=p;
    }
    public void setTime(double t){
        this.time=t;
    }
    public void setRate(double r){
        this.rate=r;
    }
    // getter
    public double getPrincipal(){
        return principal;
    }
    public double getTime(){
        return time;
    }
    public double getRate(){
        return rate;
    }
    public static void main(String[] args) {
        SimpleInterest simpleInterest =  new SimpleInterest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        double userPrincipal = scanner.nextDouble();
        simpleInterest.setPrincipal(userPrincipal);

        System.out.println("Enter rate: ");
        double userRate = scanner.nextDouble();
        simpleInterest.setRate(userRate);

        System.out.println("Enter time : ");
        double userTime = scanner.nextDouble();
        simpleInterest.setTime(userTime);
        // calculating simple interes
        double result = (simpleInterest.getPrincipal()*simpleInterest.getRate()*simpleInterest.getTime())/100;
        System.out.println("The calculated interest is : "+result);
        scanner.close();

    }
}