package com.itamus90;

/**
 * Created by Itamar on 24-Jul-17.
 */
public class Checking extends Account
{
    private static String accountType = "checking";

    public Checking(double initialDeposit)
    {
        super();
        checkInterest();
    }

    @Override
    public String toString()
    {
        return "Account type: " + accountType + " Account\n"
                + "Account number: " + this.getAccountNumber() + "\n"
                + "Balance: " + this.getBalance() + "\n"
                + "Interest: " + this. getInterest() + "\n";
    }
}
