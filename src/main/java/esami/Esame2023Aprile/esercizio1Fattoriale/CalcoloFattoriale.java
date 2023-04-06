package esami.Esame2023Aprile.esercizio1Fattoriale;


import java.util.*;
public class CalcoloFattoriale{

    public static Scanner scanner= new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Benvenuto, inserisci un numero e io ne calcolo il fattoriale");

        boolean ancora=true;

        while (ancora){
            int numero = inserisciNumero("inserici un numero intero");
            System.out.println("bene, hai inserito il numero: " + numero);

            System.out.println("Ora dimmi quale funzione vuoi che io usi:");
            System.out.println("1 -> algoritmo ricorsivo");
            System.out.println("2 -> algoritmo iterativo");

            //while per l'inpute della scelta
            boolean erroreSceltaAlgoritmo = true;
            while(erroreSceltaAlgoritmo){
                int sceltaAlgoritmo=inserisciNumero("scegli l'algoritmo:");
                int fattoriale=0;
                if(sceltaAlgoritmo==1){
                    erroreSceltaAlgoritmo=false;
                    fattoriale=fattorialeRicorsivo(numero);
                    System.out.println("il fattoriale calcolato con l'algoritmo iterativo e': " + fattoriale);
                }
                else if(sceltaAlgoritmo==2){
                    erroreSceltaAlgoritmo=false;
                    fattoriale=fattorialeIterativo(numero);
                    System.out.println("il fattoriale calcolato con l'algoritmo iterativo e': " + fattoriale);
                }
                else{
                    System.out.println("Attenzione, digita 1 o 2!");
                }

            }//fine erroreSceltaAlgoritmo



            //TODO implementare richiesta di uscita o calcolo nuovo fattoriale

        }//fine while inseriemnto numero

    }//fine main


    public static int fattorialeRicorsivo(int numero){
        int fattoriale;
        if(numero==0)return 1;
        else{
            fattoriale=numero*fattorialeRicorsivo(numero-1);
        }
        return fattoriale;
    }//fine fattorialeRicorsivo



    public static int fattorialeIterativo(int numero){
        int fattoriale = 1;
        for(int x=numero; x>0; x--){
            fattoriale=fattoriale*x;
        }
        return fattoriale;
    }//fine fattorialeIterativo





    public static String inserisciStringaNonVuota(String label){
        System.out.println(label);
        String txt="";
        boolean errore=true;
        while (errore){
            txt=scanner.nextLine();
            if(txt.isEmpty()){
                System.out.println("Attenzione, inserira un testo.");
                System.out.println(label);
            }
            else{
                errore=false;
            }

        }
        return txt;

    }//fine inserisciStringaNonVuota



    public static int inserisciNumero(String label){
        System.out.println(label);
        int numero=-1;
        boolean errore=true;
        while(errore){
            String txt= scanner.nextLine();
            try{
                numero = Integer.parseInt(txt);
                errore=false;
            } catch (NumberFormatException e){
                System.out.println("Attenzione inserire un numero intero");
                System.out.println(label);
            }
        }

        return numero;
    }//fine inserisciNumero



}




