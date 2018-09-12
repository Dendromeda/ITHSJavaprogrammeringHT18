package accountsystem;

public class Deposit extends Transaction{
    
    
    public Deposit(int amount){
        super(amount);
    }
    
    public String toString(){
        return super.toString() + " deposited.";
    }
    
}
