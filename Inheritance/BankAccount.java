package Inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    // Getter
    public String getAccountNumber(){
        return accountNumber;
    }


}
