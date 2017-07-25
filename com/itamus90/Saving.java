package com.itamus90;

/**
 * Created by Itamar on 24-Jul-17.
 */
public class Saving extends Account
{
    private static String accountType = "saving";

    public Saving(double initialDeposit)
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
                + "Interest: " + this. getInterest( ) + "%\n";
    }
}
