package edu.neumont.mgt101.controller;

import edu.neumont.mgt101.model.OTC;
import edu.neumont.mgt101.model.User;
import edu.neumont.mgt101.view.UI;

public class Controller {

    //region Objects/Running booleans

    User user = new User(null, null);
    OTC oneTimeCode = new OTC();
    boolean running = true;
    boolean firstOpened = true;
    boolean createdUser = false;
    boolean loggedIn = false;

    //endregion

    //region Log In

    public void run(){
        if(firstOpened){
            UI.br();
            UI.printOTC(oneTimeCode.getValue());
            firstOpened = false;
        }
        do{
            UI.br();
            switch(UI.loginMenu()){
                case 1:
                    if(!createdUser){
                        signUp();
                    }else{
                        UI.br();
                        UI.error(1);
                    }
                    break;
                case 2:
                    if(createdUser){
                        login();
                    }else{
                        UI.br();
                        UI.error(4);
                    }
                    break;
                case 3:
                    running = false;
                    break;
            }
        }while(running);
        UI.br();
        UI.exit();
    }

    private void signUp(){
        user = new User(UI.signUpUsername(), UI.signUpPassword());
        createdUser = true;
        UI.br();
        UI.success(1);
    }

    private void login(){
        UI.br();
        if(UI.loginUsername().equals(user.getUsername()) && UI.loginPassword().equals(user.getPassword())){
            UI.br();
            if(UI.loginOTC() == oneTimeCode.getValue()){
                UI.br();
                loggedIn = true;
                UI.success(2);
                mainMenu();
            }else{
                UI.br();
                UI.error(3);
            }
        }else{
            UI.br();
            UI.error(2);
        }
    }

    //endregion

    private void mainMenu(){
        do{
            UI.br();
            switch(UI.mainMenu(user.getUsername())){
                case 1:
                    UI.br();
                    if(UI.confirmation(1) == 1){
                        loggedIn = false;
                    }
                    break;
            }
        }while(loggedIn);
    }
}
