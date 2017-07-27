package com.itamus90;

/**
 * Created by Itamar on 24-Jul-17.
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String ssn;
    private Account account;

    public Customer(String firstName, String lastName, String ssn, Account account)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.account = account;
    }

    public Account getAccount()
    {
        return account;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", account=" + account +
                '}';
    }

    public String baseInfo()
    {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
