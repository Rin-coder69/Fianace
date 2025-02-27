package edu.neumont.mgt101.model;

import edu.neumont.mgt101.view.UI;

import java.util.ArrayList;

public class Transaction {

    public void addTransaction(ArrayList<String> transactions) {
        UI.br();
        String currentTransaction = UI.addTransaction();
        if(!(currentTransaction.equals("!"))){
            UI.br();
            switch (UI.confirmation(2)){
                case 1:
                    UI.br();
                    transactions.add(currentTransaction);
                    UI.success(3);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void listTransactions(ArrayList<String> transactions) {
        if(!(transactions.isEmpty())){
            for (int i = 0; i < transactions.size(); i++) {
                UI.br();
                UI.listTransactions(transactions.get(i), i + 1);
            }
        }else{
            UI.br();
            UI.error(6);
        }
    }

    public void removeTransaction(ArrayList<String> transactions) {
        UI.br();
        if(!(transactions.isEmpty())) {
            String currentTransaction = UI.removeTransaction();
            if (!(currentTransaction.equals("!"))){
                for (int i = 0; i < transactions.size(); i++) {
                    if (currentTransaction.equals(transactions.get(i))) {
                        UI.br();
                        switch (UI.confirmation(3)) {
                            case 1:
                                UI.br();
                                transactions.remove(i);
                                UI.success(4);
                                return;
                            case 2:
                                return;
                        }
                    }
                }
                UI.error(5);
            }
        }else{
            UI.error(6);
        }

    }
}
