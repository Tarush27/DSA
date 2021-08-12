package threads;
import java.util.*;
public class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isEnough(int w){
        if (bal > w){
            return true;
        }
        return false;
    }

    public void withdraw(int amt){
        bal = bal - amt;
        System.out.println("Withdrawal amt is : " + amt);
        System.out.println("Current balance is : " + bal);
    }

}
