package com.assignment_4.subclasses;

import java.util.UUID;
import com.assignment_4.superclasses.BankAccount;

/**represents account on which money is saved
 * @author anna
 *   */

public class SavingAccount extends BankAccount {
   
/**
 *  creates random number of 6 digits and sets
 *         that number to the AccNumber
 *         gives the value of the balance and AccountType
 */
    public SavingAccount() {
        this.setAccNumber(UUID.randomUUID().toString().substring(0, 6));
        this.setBalance(0.0);
        this.setAccountType("Saving Account");
    }

}