package vari;

//NumeroPrimo.js


import java.util.*;

public class NumeroPrimoTest {

    private final static int MIN = 734;
    private final static int MAX = 57892;

    public static void main(String[] args) {


        System.out.println("Benvenuto, inserisci un numero compreso tra " + MIN + " e " + MAX);

        Scanner input = new Scanner(System.in);


        boolean inAttesaDiUnNumero = true;
        do {

            String a = input.nextLine();


            try {

                int numeroInserito = Integer.parseInt(a);





                if (numeroInserito < MIN || numeroInserito > MAX) {
                    inAttesaDiUnNumero = true;
                    System.out.println("Devi inserire un numero compreso tra " + MIN + " e " + MAX);


                } else {

                    if (numeroInserito % 2 == 0) {
                        System.out.println("il numero " + numeroInserito + " non e' un numero primo");
                    }else {

                    }


                    inAttesaDiUnNumero = false;
                }


            } catch (NumberFormatException e) {


                System.out.println("Attenzione, devi inserire un numero");

            }


        } while (inAttesaDiUnNumero);


    }

}