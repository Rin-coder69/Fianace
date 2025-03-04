package edu.neumont.mgt101.controller;

import edu.neumont.mgt101.model.IncomeTracker;
import edu.neumont.mgt101.view.IncomeUI;

public class IncomeController {
    boolean active = true;
    IncomeTracker tracker = new IncomeTracker();
    public void run(){
        do{
        switch (IncomeUI.incomeUI()){
            case 1:
                deposit();
            break;
            case 2:
                withdraw();
            break;
            case 3:
                active = false;
        }
        }while(active);
    }


    public void deposit(){
        tracker.deposit(IncomeUI.deposit());
    }

    public void withdraw(){
        tracker.withdraw(IncomeUI.withdraw());
    }
}
