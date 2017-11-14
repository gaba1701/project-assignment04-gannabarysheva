package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/** Implements the interface BankOperations
*/

public class BankAccount implements BankOperations {
    /**@param number of account
     * @param is a type of account
     * @param amount of money on bank account
     */
    private String accNumber;
    private String accountType;
    private double balance;

    public String getAccNumber() {

        return accNumber;
    }

    public void setAccNumber(String accNumber) {

        this.accNumber = accNumber;
    }

    public String getAccountType() {
        return accountType;
    }


    public double getBalance() {
        return balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
   
    public void setBalance(double balance) {
        this.balance = balance;
    }

/**
  *  creates random number of 6 digits and sets
 *         that number to the AccNumber
 *         gives the value of the balance and AccountType
 */
    public BankAccount() {

        this.accNumber = UUID.randomUUID().toString().substring(0, 6);
        this.balance = 0;
        this.accountType = "Bank account";
   
       
    }
/**
 * withdraw money from account. Gives the message if withdraw amount is negative number
 */
    @Override
    public void withDrawMoney(double amount) {

        if (amount >= 0)
            setBalance(getBalance() - amount);
        else
            System.out.println("You can not  withdraw with negativ value");

    }

    @Override
    /**
     * add amount of money to the account and shows a message if amount is negative number
     */
    public void depositMoney(double amount) {
        if (amount >= 0)
            setBalance(getBalance() + amount);
        else
            System.out.println("You can not put negativ amount of money to your deposit");
    }
/**
 * creates information about account in line
 */
    @Override
    public String toString() {
        return "\n"+ "BankAccount [accountNumber=" + accNumber + ", accountType=" + accountType + ", balance=" + balance + "]";
    }

   
}