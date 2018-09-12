package accountsystem;

import java.util.Date;

public class Transfer extends Transaction{
    private Account from;
    private Account to;
    
    
    public Transfer(int amount, Account from, Account to){
        super(amount);
        this.from = from;
        this.to = to;
    }
    
    public String toString(){
        return super.toString() +  " from " + from.getName() + "(" + from.getAccountId() + ") to " + to.getName() + "(" + to.getAccountId() + ")";
    }
}
