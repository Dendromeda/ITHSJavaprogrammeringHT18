package accountsystem;

import java.util.ArrayList;

public class Account {
    private static int nextId;
    
    private String name;
    private int accountId;
    private ArrayList<Transaction> transactionList;
    private int balance;
    
    public Account(String name){
        this.name = name;
        transactionList = new ArrayList();
        this.accountId = nextId;
        nextId++;
        transactionList.add(new AccountCreation());
    }
    
    public boolean withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            transactionList.add(new Withdrawal(amount));
            return true;
        }
        else {
            return false;
        }
    }
    
    public void deposit(int amount){
        balance += amount;
        transactionList.add(new Deposit(amount));
    }
    
    public boolean transferTo(int amount, Account to){
        if (balance >= amount){
            balance -= amount;
            to.balance += amount;
            
            Transaction newTransaction = new Transfer(amount, this, to);
            transactionList.add(newTransaction);
            to.transactionList.add(newTransaction);
            
            return true;
        }
        else{
            return false;
        }
    }
    
    public void printTransactionList(){
        System.out.println( accountId + "/  " + name);
        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
    }
    
    
    public String getName() {
        return name;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    
    
    
    
    
    
}
