package edu.neumont.mg2101.models;

import edu.neumont.mg2101.models.interfaces.Exchange;
import edu.neumont.mg2101.view.UI;

public class IncomeTracker implements Exchange {
    private int totalMoney;
    private int moneyBeingAdded;
    private int moneyBeingWithdrawn;

    public int getTotalMoney() {
        return totalMoney;
    }

    private void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public int deposit(int moneyAdded) {
        if (moneyAdded >= 100000) {
            new UI().complain();
            setTotalMoney(getTotalMoney() + moneyAdded);
        }else{
            setTotalMoney(getTotalMoney() + moneyAdded);
            System.out.println("You have Deposited: " + moneyAdded + " dollars!");
        }
        return getTotalMoney();
    }



    @Override
    public int withdraw(int moneyTaken) {
        if (moneyTaken > getTotalMoney()) {
            System.out.println("You don't have that much money!");
        }else{
        setTotalMoney(getTotalMoney() - moneyTaken);
        System.out.println("You have Withdrawn: " + moneyTaken + " dollars!");
        }
        return moneyTaken;
    }

}
