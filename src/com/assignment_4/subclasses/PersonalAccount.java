package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**

 * represent account type Personal. Extends BankAccount
 */

public class PersonalAccount extends BankAccount {
    /**
 *  creates random number of 6 digits and sets
 *         that number to the AccNumber
 *         gives the value of the balance and AccountType
     */
    public PersonalAccount() {
        this.setAccNumber(UUID.randomUUID().toString().substring(0, 6));
        this.setBalance(0.0);
        this.setAccountType("Personal Account");
    }

}