package src.main.java.com.javaoop.program;

import src.main.java.com.javaoop.bankaccount.BankAccount;

public class Program {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        System.out.println("Account number: " + myAccount.getAccountNumber());
        myAccount.depositMoney(20, 2);
        System.out.println("My savings account balance: " + myAccount.getSavingsAccountBalance());
        System.out.println("My current account balance: " + myAccount.getCurrentAccountBalance());
        System.out.println("Total amount in my account:" + myAccount.getMyTotalAmount());
        System.out.println("Total accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total amount in Bank: " + BankAccount.getTotalAmount());
        BankAccount myAccount2 = new BankAccount();
        myAccount2.depositMoney(50, 1);
        System.out.println("My current account balance: " + myAccount2.getCurrentAccountBalance());
        System.out.println("Account number: " + myAccount2.getAccountNumber());
    }
}
