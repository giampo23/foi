package vari;


import java.util.Scanner;

//StringheUguali.java
public class StrigheUguali{


    public static void main (String[] args){
        System.out.println("Ciao, scrivi due parole e vediamo se sono uguali.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima:");
        String parola1= scanner.nextLine();

        System.out.println("Inserisci la seconda:");
        String parola2= scanner.nextLine();

        if(parola1.equals(parola2)){
            System.out.println("le parole sono uguali");
        }
        else if(parola1.equalsIgnoreCase(parola2)){
            System.out.println("le parole sono quasi uguali");
        }
        else{
            //conto le lettere differenti
            //conto il numero di caratteri
            System.out.println("le parole sono differenti");
            //ordino le string



        }




    }

}