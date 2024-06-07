package src.main.java.com.javaoop.bankaccount;

import java.util.concurrent.ThreadLocalRandom;

import src.main.java.com.javaoop.utility.Messages;

public class BankAccount {
    private final String accountNumber;
    private double currentAccountBalance;
    private double savingsAccountBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmount = 0.0;
    private Messages message = new Messages();

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.currentAccountBalance = 0.0;
        this.savingsAccountBalance = 0.0;
        numberOfAccounts++;
        message.welcome();
        message.prntAccountTypes();
    }

    private int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private String generateAccountNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(generateRandomNumber(0, 9));
        }
        return sb.toString();
    }

    private boolean isGreaterThan0(double value) {
        return value > 0;
    }

    public void depositMoney(double amount, int accountType) {
        if (!isGreaterThan0(amount)) {
            message.amountIncorrect();
            return;
        }
        switch (accountType) {
            case 1:
                this.currentAccountBalance += amount;
                break;
            case 2:
                this.savingsAccountBalance += amount;
                break;
            default:
                message.accountTypeInvalid();
        }
        totalAmount += amount;
    }

    private boolean isEnoughAmount(double withdrawFrom, double withdrawAmount) {
        return withdrawFrom >= withdrawAmount;
    }

    public void withdrawMoney(double amount, int accountType) {
        if (!isGreaterThan0(amount)) {
            message.amountIncorrect();
            return;
        }
        switch (accountType) {
            case 1:
                if (isEnoughAmount(getCurrentAccountBalance(), amount)) {
                    this.currentAccountBalance -= amount;
                    totalAmount -= amount;
                } else {
                    message.insufficientAmount();
                }
                break;
            case 2:
                if (isEnoughAmount(getSavingsAccountBalance(), amount)) {
                    this.savingsAccountBalance -= amount;
                    totalAmount -= amount;
                } else {
                    message.insufficientAmount();
                }
                break;
            default:
                message.accountTypeInvalid();
        }
    }

    public static int getNumberOfAccounts() {
        return BankAccount.numberOfAccounts;
    }

    public static double getTotalAmount() {
        return BankAccount.totalAmount;
    }

    public double getMyTotalAmount() {
        return this.currentAccountBalance + this.savingsAccountBalance;
    }

    public double getCurrentAccountBalance() {
        return this.currentAccountBalance;
    }

    public double getSavingsAccountBalance() {
        return this.savingsAccountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}