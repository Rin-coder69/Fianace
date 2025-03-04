package edu.neumont.mgt101.model;

public class Budgeting {
    private double save;
    private double want;
    private double need;
    private double totalBudget;

    public double budgeting(){
        this.need = totalBudget * .5;
        this.want = totalBudget * .3;
        this.save = totalBudget * .2;
        return totalBudget;
    }
    public void display(){
        System.out.println("Budgeting: " + totalBudget);
        System.out.println("Needs: 50% of your budget " + need);
        System.out.println("Spent: 30% of your budget" + want);
        System.out.println("Save: 20% of your budget" + save);
    }

    public double getSave() {
        return save;
    }

    public void setSave(double save) {
        this.save = save;
    }

    public double getWant() {
        return want;
    }

    public void setWant(double want) {
        this.want = want;
    }

    public double getNeed() {
        return need;
    }

    public void setNeed(double need) {
        this.need = need;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }
}
