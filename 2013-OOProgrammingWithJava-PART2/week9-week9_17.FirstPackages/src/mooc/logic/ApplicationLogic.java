/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

/**
 *
 * @author duonghaily
 */
public class ApplicationLogic {
    private UserInterface test;
    public ApplicationLogic(UserInterface ui){
        this.test = ui;
    }
    public void execute(int howManyTimes){
        for(int i=0;i<howManyTimes;i++){
            System.out.println("The application logic works");
            this.test.update();
        }
    }
}
