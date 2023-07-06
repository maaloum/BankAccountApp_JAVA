package com.bankingapplication.bankingapplication;

public class BankAccount {

    double balance;
    double previousTransaction;
    String customerName;
    String getCustomerId;

    public BankAccount(){
        balance = 0.0;
    }

    public BankAccount(double balance, int previousTransaction, String customerName, String getCustomerId) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
        this.customerName = customerName;
        this.getCustomerId = getCustomerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTranscation(int previousTranacation) {
        this.previousTransaction = previousTranacation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGetCustomerId() {
        return getCustomerId;
    }

    public void setGetCustomerId(String getCustomerId) {
        this.getCustomerId = getCustomerId;
    }

//    deposite method
    public void deposite( double amount){
            if(amount > 0){
                balance += amount;
                previousTransaction = amount;
            }
    }

//    Withdraw
    public void withdaw(double amount){
        if(amount > 0 && balance > 0) {
            balance = balance - amount;
            previousTransaction = - amount;
        }
    }
    public double checkBalance(){
        return getBalance();
    }

    public void transfert( BankAccount bank, double amount){
        if(amount <= balance){
            withdaw(amount);
            bank.deposite(amount);
            System.out.println("\nTransfer succesful. Tansfered: $" + amount);
        } else {
            System.out.println("\nTransfer failed, not enough balance!");
        }
    }

    public void close() {
        balance = 0.0;
    }





}
