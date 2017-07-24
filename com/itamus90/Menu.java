package com.itamus90;

import java.util.Scanner;

public class Menu
{
    private Scanner keyboard = new Scanner(System.in);
    private Bank bank = new Bank();
    private boolean isExit = false;

    //Instead to use in String for accountType
    //i can create Enum AccountType
    //using in Enum make the code more reuseabilly mintaiablliy
    private String checking = "checking";
    private String saving = "saving";

    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.runMenu();
    }

    private void runMenu()
    {
        int choice = Integer.MAX_VALUE;
        printHeader();

        while (!isExit)
        {
            printMenu();
            choice = getInput();
            performAction(choice);
        }
    }

    private void performAction(int choice)
    {
        switch (choice)
        {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
            case 1:
                createAccount();
                break;
            case 2:
                makeDeposit();
                break;
            case 3:
                makeWithdraw();
                break;
            case 4:
                listBalance();
                break;

            default:
                System.out.println("Unknown error occurred.");
        }
    }

    private int getInput()
    {
        int choice = -1;
        boolean isOutOfRange = false;
        do
        {
            System.out.print("Enter your choice: ");

            try
            {
                choice = Integer.parseInt(keyboard.nextLine());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Invalid selection number only: " + nfe.getMessage());
            }

            if (choice < 0 || choice > 4)
            {
                System.out.println("Choice outside of range. Please Choose again.");
                isOutOfRange = true;
            }
        }
        while (isOutOfRange);

        return choice;
    }

    private void printHeader()
    {
        System.out.println("-------------------------------");
        System.out.println("|   Welcome to Customer       |");
        System.out.println("|   Awesome Bank App          |");
        System.out.println("-------------------------------");
    }

    private void printMenu()
    {
        System.out.println("Please make selection:");
        System.out.println("1) Create a new account");
        System.out.println("2) Make a deposit ");
        System.out.println("3) Make a withdraw ");
        System.out.println("4) List account balance ");
        System.out.println("0) Exit");
    }

    private void createAccount()
    {
        Account account = null;
        String firstName = null;
        String lastName = null;
        String ssn = null;
        String accountType = null;
        double initialDeposit = Double.MIN_VALUE;
        boolean valid = false;

        while (!valid)
        {
            System.out.println("Please enter account type(checking/saving): ");
            accountType = keyboard.nextLine();

            if ((accountType.equalsIgnoreCase(checking)) || (accountType.equalsIgnoreCase(saving)))
            {
                valid = true;
            }
            else
            {
                System.out.println("Invalid type selected. please enter checking or saving");
            }
        }

        System.out.print("PLease enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.print("PLease enter tour last name: ");
        lastName = keyboard.nextLine();
        System.out.print("Please enter your social security number: ");
        ssn = keyboard.nextLine();

        valid = false;

        while (!valid)
        {
            System.out.println("PLease enter an initial deposit: ");

            try
            {
                initialDeposit = Double.parseDouble(keyboard.nextLine());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Deposit must be a number " + nfe.getMessage());
            }

            if (accountType.equalsIgnoreCase(checking))
            {
                 if (initialDeposit < 100)
                 {
                     System.out.println("Checking accounts request a minimum of $100 dollars to open.");
                 }
                 else
                 {
                     valid = true;
                 }
            }
            else if (accountType.equalsIgnoreCase(saving))
            {
                if (initialDeposit < 50)
                {
                    System.out.println("Saving accounts request a minimum of $50 dollars to open.");
                }
                else
                {
                    valid = true;
                }
            }
        }

        //Create Account
        if (accountType.equalsIgnoreCase(checking))
        {
            account = new Checking(initialDeposit);
        }
        else if (accountType.equalsIgnoreCase(saving))
        {
            account = new Saving(initialDeposit);
        }
    }

    private void makeDeposit()
    {

    }

    private void makeWithdraw()
    {

    }

    private void listBalance()
    {

    }

}
