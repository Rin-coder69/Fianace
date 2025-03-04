package edu.neumont.mgt101.model;

import java.util.ArrayList;
import java.util.Random;

public class OTC {
    private Random randNum = new Random();
    private Random randMult = new Random();
    private int value;

    public OTC() {
        setValue(generateValue());
    }

    private int generateValue(){
        do{
            int numAdd = randNum.nextInt(10);
            value += numAdd;
        }while(value < Integer.SIZE*(randMult.nextInt(50)+10));
        return value;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
