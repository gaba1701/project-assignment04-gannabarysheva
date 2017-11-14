package com.assignment_4.subclasses;

import java.util.ArrayList;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * Creates array list of banks accounts, deposits and withdraw an amount of money to an specific account. Prints information about customer and accounts
 */

public class BankCustomer extends Human {
    ArrayList<BankAccount> customerAccount = new ArrayList<BankAccount>();

    /**
     * Takes parameters of the Human class and calls the constructor of the superclass
     * @param name name of the customer
     * @param age customers age
     */
    public BankCustomer(String name, int age) {
        super(name, age);
    }
/**
 * Gets CustomerAccounts
 * @return customerAccount
 */
    public ArrayList<BankAccount> getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
        this.customerAccount = customerAccount;
    }

    public void addAccount(BankAccount bankAccount) {
        this.customerAccount.add(bankAccount);
    }
/**
 * Puts amount of money to the bank account
 * @param accountNumber number of account
 * @param amount amount of money
 *
 */
    public void depositToAccount(String accountNumber, double amount) {
        for (int i = 0; i < customerAccount.size(); i++) {
            if (customerAccount.get(i).getAccNumber().equals(accountNumber)) {
                customerAccount.get(i).depositMoney(amount);
            }
        }
    }

    /**
     * Withdraw money from a specific account to customerAccounts in ArrayList
     * @param accountName name of account
     * @param amount amount of money
     */
    public void withdrawFromAccount(String accountName, double amount) {
        for (int i = 0; i < customerAccount.size(); i++) {
            if (customerAccount.get(i).getAccNumber().equals(accountName)) {
                customerAccount.get(i).withDrawMoney(amount);
            }
        }
    }

    /**
     * prints the name and the age of a bankCustomer in one line and the information of all accounts of customer.
     */
    @Override
    public String toString() {
        System.out.println("\nName:" + getName() + " Age is: " + getAge());
       
    return  customerAccount.toString();
       
    }
}