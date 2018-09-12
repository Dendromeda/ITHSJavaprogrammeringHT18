package accountsystem;

public class Withdrawal extends Transaction{
    
    public Withdrawal(int amount){
        super(amount);
    }
    
    public String toString(){
        return super.toString() + " withdrawn.";
    }
}
