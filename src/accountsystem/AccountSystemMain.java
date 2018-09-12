/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsystem;

import java.util.Date;

/**
 *
 * @author Jakob
 */
public class AccountSystemMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account("Ulf");
        Account a2 = new Account("Anna");
        
        a1.deposit(1000);
        a2.deposit(50);
        a1.transferTo(300, a2);
        a2.transferTo(50, a1);
        a1.withdraw(300);
        a1.printTransactionList();
    }
    
}
