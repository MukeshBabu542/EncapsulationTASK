package Encapsulation;

 class BankAccount {
    // private methods
    private String account_no;
    private String account_holder;
    private double account_balance;
    public BankAccount(String acc_no, String acc_holder, double acc_blc){
        this.account_no=acc_no;
        this.account_holder=acc_holder;
        this.account_balance= acc_blc;
    }
    // getter
    public String getAccNo(){
        return account_no;
    }
    public String getAccHolder(){
        return account_holder;
    }
    public double getAccBalance(){
        return account_balance;
    }
    // setter
    public void setAccNo(String account_no){
        this.account_no=account_no;
    }
    public void setAccHolder(String account_holder){
        this.account_holder=account_holder;
    }
    // public void setAccBalance(double account_balance){
    //     if(account_balance>0){
    //     this.account_balance=account_balance;
    //     }else{
    //         System.out.println("Account balance need to be more than zero.");
    //     }
    // }
    // public methods 
    public void deposit(int money){
        if(money>0){
        account_balance+=money;
    }else{
        System.out.println("Fund should be positive only");
    }
}
    public void withdraw(int money){
        if(account_balance<money){
            System.out.println("insufficient balance");
        }else if(money<0){
            System.out.println("The value about to deposit should be positive.");
        }else{
        account_balance -=money;
    }
}

}
public class BankAccountMain{
    public static void main(String[] args) {
        BankAccount objBank = new BankAccount("10101", "Babita Adhikari", 42000);
        // getting initial values
        System.out.println("the account number is : "+objBank.getAccNo());
        System.out.println("the account holder name is : "+objBank.getAccHolder());
        System.out.println("the account has " + objBank.getAccBalance()+ " balance.");
        // updating values
        // objBank.setAccBalance(2000);
        objBank.deposit(200);
        System.out.println("new current balance is "+objBank.getAccBalance());
    }

}
