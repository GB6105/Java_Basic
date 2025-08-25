package oop.ex;

public class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }
    int deposit(int amount){
        return balance += amount;
    }

    int withdraw(int amount){
        if(balance <= amount){
            System.out.println("잔고 부족");
            return balance;
        }
        return balance -= amount;
    }
}
