package accountsystem;

import java.util.Date;

public class AccountCreation extends Transaction{
    
    public AccountCreation(){
        super(0);
    }
    
    public String toString(){
        return getDate() + " ["+ getTransactionId() +"] Account created.";
    }
    
}
