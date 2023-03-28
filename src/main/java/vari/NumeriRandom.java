package vari;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class NumeriRandom {


    public static void main(String[] arbs) {


        fattorizzazione(57);
        fattorizzazione(4567);
        fattorizzazione(113);
        fattorizzazione(788);


    }


    public static void fattorizzazione(int n) {
        System.out.println("Scomposizione di: " + n);
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.println("Fattore: " + c);
                n = n / c;
            } else {
                c++;
            }
        }
        System.out.println("######################");

    }//end fattorizzazione


    public static int sommaDiXNumeriRandom(int numeri) {

        Random rand = new Random();
        int somma = 0;
        for (int x = 0; x <= numeri; x++) {

            somma += (int) (Math.random() * 20);

        }

        return somma;
    }


}