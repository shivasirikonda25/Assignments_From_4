package com.banksystem;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(40000);

        Thread holder1 = new Thread(new AccountHolder(account, 3500), "Holder1");
        Thread holder2 = new Thread(new AccountHolder(account, 3700), "Holder2");
        Thread holder3 = new Thread(new AccountHolder(account, 6700), "Holder3");

        holder1.start();
        holder2.start();
        holder3.start();
    }
}