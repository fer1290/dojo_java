package src.main.java.com.javaoopadv.bankaccount;

public class Messages {
    public void welcome(){
        System.out.println("Welcome");
    }
    public void prntAccountTypes(){
        System.out.println("**********");
        System.out.println("Account Types:");
        System.out.println("1: Current Account");
        System.out.println("2: Savings Account");
        System.out.println("**********");
    }
    public void amountIncorrect(){
        System.out.println("Incorrect amount");
    }
    public void accountTypeInvalid(){
        System.out.println("Account Type invalid");
    }
    public void insufficientAmount(){
        System.out.println("Insufficient amount");
    }
}
