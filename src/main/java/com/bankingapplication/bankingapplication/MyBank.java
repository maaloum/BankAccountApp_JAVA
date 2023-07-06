package com.bankingapplication.bankingapplication;

public class MyBank {

    public static void main(String[] args) {
        BankAccount[] bank = { new BankAccount(), new BankAccount(), new BankAccount(),
                new BankAccount() };
        bank[0].setBalance(300);
        bank[1].setBalance(2999);
        bank[2].setBalance(3728);
        bank[3].setBalance(3783);

        double x = 100.00;
        System.out.printf("Transferring $%.2f from Acc 1 to Acc 2.\n", x); //printf example
        System.out.println("Acc 1 previous balance: " + bank[0].checkBalance());
        System.out.println("Acc 2 previous balance: " + bank[1].checkBalance());
        bank[0].transfert(bank[1], x);
        System.out.println("Acc 1 balance after transfer: " + bank[0].getBalance());
        System.out.println("Acc 2  balance after transfer: " + bank[1].getBalance());

    }
}
