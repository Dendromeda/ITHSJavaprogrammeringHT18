package accountsystem;

import java.util.Date;

public abstract class Transaction {
    private static int nextId;
    
    private int amount;
    private Date date;
    private int transactionId;

    public Transaction(int amount){
        this.date = new Date();
        transactionId = nextId++;
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    
    public String toString(){
        return getDate() + " ["+ getTransactionId() +"] " + getAmount();
    }
    
}
