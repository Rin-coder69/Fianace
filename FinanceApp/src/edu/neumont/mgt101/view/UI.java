package edu.neumont.mgt101.view;

import edu.neumont.mgt101.Console;

public class UI {

    //region Login

    public static int loginMenu(){
        return Console.getIntInput("""
                Welcome.
                1. Sign Up
                2. Log in
                3. Exit
                """, 1, 3);
    }

    public static void printOTC(int OTC){
        Console.writeLn("One time code for session: " + OTC);
    }

    public static String signUpUsername(){
        return Console.getStringInput("""
                Enter a new username!
                """, false);
    }

    public static String signUpPassword(){
        return Console.getStringInput("""
                Enter a new password!
                """, false);
    }

    public static String loginUsername(){
        return Console.getStringInput("""
                Enter your username!
                """, false);
    }

    public static String loginPassword(){
        return Console.getStringInput("""
                Enter your password!
                """, false);
    }

    public static int loginOTC(){
        return Console.getIntInput("""
                Enter your 2FA code!
                """);
    }

    //endregion

    public static int mainMenu(String user){
        Console.writeLn("Welcome " + user + "!");
        return Console.getIntInput("""
                What would you like to do?
                1. Log out
                2. Manage Transactions
                """, 1, 2);
    }

    public static int transactionMenu(){
        return Console.getIntInput("""
                What would you like to do?
                1. Add Transaction
                2. List Transactions
                3. Remove Transaction
                4. Back
                """, 1, 4);
    }

    public static String addTransaction(){
        return Console.getStringInput("""
                Add a transaction to record! ("!" to cancel)
                """);
    }

    public static void listTransactions(String item, int index){
        Console.writeLn(index + ". " + item);
    }

    public static String removeTransaction(){
        return Console.getStringInput("""
                Write a transaction to remove! ("!" to cancel)
                """);
    }

    public static void error(int reason){
        Console.writeLn("Error.");
        switch (reason) {
            case 1:
                Console.writeLn("User already created.");
                break;
            case 2:
                Console.writeLn("Incorrect username or password.");
                break;
            case 3:
                Console.writeLn("Incorrect 2FA code.");
                break;
            case 4:
                Console.writeLn("User not created.");
                break;
            case 5:
                Console.writeLn("Item does not exist.");
                break;
            case 6:
                Console.writeLn("This is empty.");
                break;
        }
    }

    public static void success(int reason){
        Console.writeLn("Success.");
        switch (reason) {
            case 1:
                Console.writeLn("User created.");
                break;
            case 2:
                Console.writeLn("Logged in.");
                break;
            case 3:
                Console.writeLn("Transaction added.");
                break;
            case 4:
                Console.writeLn("Transaction removed.");
                break;
        }
    }

    public static int confirmation(int reason){
        switch (reason) {
            case 1:
                Console.writeLn("Log out?");
                break;
            case 2:
                Console.writeLn("Add this transaction?");
                break;
            case 3:
                Console.writeLn("Remove this transaction?");
        }
        return Console.getIntInput("""
                Confirm:
                1. Yes
                2. No
                """, 1, 2);
    }

    public static void exit(){
        Console.writeLn("Thank you.");
    }

    public static void br(){
        Console.writeLn("--------------------");
    }
}
