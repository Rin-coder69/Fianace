package edu.neumont.mg2101.view;


import edu.neumont.mg2101.Console;

public class UI {
    public void complain(){
        System.out.println("Are you sure you don't want to share a little?");
    }

    public static int incomeUI(){
        return Console.getIntInput("""
                1. Deposit Money
                2. Withdraw Money
                3. Exit
                """);
    }

    public static int deposit(){
        return Console.getIntInput("How much do you want to deposit?");
    }

    public static int withdraw(){
        return Console.getIntInput("How much do you want to withdraw?");
    }

    public static void leave(){
        System.out.println("Bye!");
    }


}
