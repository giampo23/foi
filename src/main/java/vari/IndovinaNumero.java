package vari;

import java.util.Scanner;

public class IndovinaNumero{

    public static void main (String args[]){

        System.out.println("Vediamo se indovini che numero ho pensato.....");

        int limiteNumeri=100;
        System.out.println("Scegli un numero da 1 a " + limiteNumeri);


        int numeroDaIndovinare = (int)(Math.random()*limiteNumeri);
        System.out.println("il numero da indovinare e'  " + numeroDaIndovinare);
        int numeroDigitato;

        //abilito gli input da tastiera in modo che l'utente possa digirare un numero
        Scanner tastiera=new Scanner(System.in);

        int tentativi = 0;

        do{
            numeroDigitato = tastiera.nextInt();
            tentativi++;



            if(numeroDigitato == numeroDaIndovinare){//il numero e' uguale, mi congratulo

                if(tentativi==1){
                    System.out.println("Impossibile!!hai indovinato al primo tentativo!!!");
                }
                else if(tentativi<=5){
                    System.out.println("Bravo..hai indovinato con soli " + tentativi + " tentativi!");
                }
                else {
                    System.out.println("Hai indovinato pero' ci hai messo ben " + tentativi + " tentativi!");
                }

            }
            else if (numeroDaIndovinare > numeroDigitato){
                System.out.println("Il numero da indovinare e' piu' grande di quello inserito. Ritenta.....");

            }
            else if (numeroDaIndovinare < numeroDigitato){
                System.out.println("Il numero da indovinare e' piu' piccolo di quello inserito. Ritenta.....");
            }

        }
        while(numeroDigitato!=numeroDaIndovinare);




    }


}