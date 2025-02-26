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

    //TODO: MAKE MAIN MENU OPTIONS
    public static int mainMenu(String user){
        Console.writeLn("Welcome " + user + "!");
        return Console.getIntInput("""
                What would you like to do?
                1. Log out
                (Sample)
                """, 1, 1);
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
        }
    }

    public static int confirmation(int reason){
        switch (reason) {
            case 1:
                Console.writeLn("Log out?");
                break;
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
