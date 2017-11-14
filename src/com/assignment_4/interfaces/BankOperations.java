package com.assignment_4.interfaces;

public interface BankOperations {
    /** Performs withdraw operation on a given bank account
     * @param amount how much money needs to be withdrawn
     */
    public void withDrawMoney(double amount);
   
    /** Performs deposit operation on a given bank account
     * @param amount how much money needs to be deposited
     *
     */
    public void depositMoney(double amount);

}