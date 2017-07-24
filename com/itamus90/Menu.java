package com.itamus90;

import java.util.Scanner;

public class Menu
{
    Scanner keyboard = new Scanner(System.in);
    Bank bank = new Bank();
    boolean isExit = false;

    public static void main(String[] args)
    {

    }

    private void runMenu()
    {
        int choice = Integer.MAX_VALUE;
        printHeader();

        while (!isExit)
        {
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
                //CreateAccount();
                break;
            case 2:
                //MakeDeposit();
                break;
            case 3:
                //MakeWithdraw();
                break;
            case 4:
                //ListBalance();
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
        while (!isOutOfRange);

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

    }

    private void makeDeposit()
    {

    }

    private void listBalance()
    {

    }

}
