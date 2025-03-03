package edu.neumont.mg2101.controller;

import edu.neumont.mg2101.models.IncomeTracker;
import edu.neumont.mg2101.view.UI;

public class IncomeController {
    boolean active = true;
    IncomeTracker tracker = new IncomeTracker();
    public void run(){
        do{
        switch (UI.incomeUI()){
            case 1:
                deposit();
            break;

            case 2:
                withdraw();
            break;
            case 3:
                UI.leave();
                active = false;
        }
        }while(active);
    }


    public void deposit(){
        tracker.deposit(UI.deposit());
    }

    public void withdraw(){
        tracker.withdraw(UI.withdraw());
    }
}
