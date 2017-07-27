package com.itamus90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Itamar on 24-Jul-17.
 */
public class Bank
{
    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer)
    {
        customerList.add(customer);
    }

    public Customer getCustomer(int account)
    {
         return customerList.get(account);
    }

    public List<Customer> getCustomerList()
    {
        return customerList;
    }
}
