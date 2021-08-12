package threads;

import java.util.Scanner;

public class Customer implements Runnable {

    private String name;
    private Account account;

    public Customer(Account account, String n) {
        this.account = account;
        name = n;
    }

    @Override
    public void run() {
        Scanner kb = new Scanner(System.in);
        System.out.println(name + " ,enter amount to withdraw");
        int amt = kb.nextInt();
        synchronized (account) {
            if (account.isEnough(amt)) {
                System.out.println(name);
                account.withdraw(amt);
            } else {
                System.out.println("insufficient balance");
            }
        }
    }
}
