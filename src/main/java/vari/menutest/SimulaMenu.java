package vari.menutest;
import java.util.Scanner;


public class SimulaMenu {

    public static void main (String[] args){
        MenuHelper menu = new MenuHelper();
        System.out.println("Bene....cosa vogliamo fare oggi?");
        System.out.println("Se non sai cosa fare puoi digitare h per l'help.");


        Scanner tastiera = new Scanner (System.in);
        String scelta;


        do{
            scelta=tastiera.next();

            if(scelta.equals("q")){
                System.out.println("ok ciao...");
            }
            else if(scelta.equals("h")){
                menu.printHelpMenu();
            }
            else if(scelta.equals("A")){
                menu.printHelpMenu();
            }
            else if(scelta.equals("B")){
                menu.printHelpMenu();
            }



        }
        while(!scelta.equals("q"));



    }

}





