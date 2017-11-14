package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

/**Default class to run the program
 */
public class Main {

    /**
     *Creates new object BankCustomer type and gives value to the parameters  makes withdraw and depositing to the accounts and prints the message
     @param args list of arguments
     */
    public static void main(String[] args) {
        String account = "";

        BankCustomer bc = new BankCustomer("Rafael", 25);
        bc.addAccount(new BankAccount());
        bc.addAccount(new PersonalAccount());
        bc.addAccount(new SavingAccount());
        System.out.println(bc.toString());

        account = bc.getCustomerAccount().get(0).getAccNumber();
        System.out.println("\nDepositing 30.0 to the first account");
        bc.depositToAccount(account, 30.0);
        System.out.println(bc.toString());

        System.out.println("\nWithdrawing 200.0 to the first account");
        account = bc.getCustomerAccount().get(1).getAccNumber();
        bc.withdrawFromAccount(account, 200.0);
        System.out.println(bc.toString());

        System.out.println("\nDepositing 200.00 to the first account");
        account = bc.getCustomerAccount().get(2).getAccNumber();
        bc.depositToAccount(account, 200.0);
        System.out.println(bc.toString());
    }

}