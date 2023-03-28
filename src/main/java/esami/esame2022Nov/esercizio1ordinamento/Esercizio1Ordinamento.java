package esami.esame2022Nov.esercizio1ordinamento;

import java.util.Arrays;

//Esercizio1Ordinamento.java
public class Esercizio1Ordinamento{


    static int numeroPassi = 0;
    static int indexMin = 0;
    static int indexMax = 0;
    public static void main (String [] args){


        int numeroElementiPresentiInArray = 10;
        int[] arrayDaOrdinare = generaArray(numeroElementiPresentiInArray);




        System.out.println("array : " + Arrays.toString(arrayDaOrdinare));

        for(int x =0; x< arrayDaOrdinare.length; x++){
            if(arrayDaOrdinare[x] < arrayDaOrdinare[indexMin])indexMin=x;
            if(arrayDaOrdinare[x] > arrayDaOrdinare[indexMax])indexMax=x;

        }



        analizzaLista(arrayDaOrdinare);



        System.out.println("array ordinato: " + Arrays.toString(arrayDaOrdinare));


        System.out.println("il nimero d elementi nella lista e' " + arrayDaOrdinare.length);
        System.out.println("Indice della lista con valore massimo: " + indexMax);
        System.out.println("Indice della lista con valore minimo: " + indexMin);
        System.out.println("Il numero di passi compiuti per ordinare la lista e':  " + numeroPassi);

    }




    /**



     */
    public static void analizzaLista(int[] array){

        for (int x=0; x<(array.length); x++){

            int min=trovaIndexMinimo(array,x);

            //devo swappare l'attuale indice con l'indice del minimo nella restante parte dell'array
            swappa(array,min,x);
            numeroPassi++;

        }
    }


    public static void swappa(int[] array, int indexOrig, int indexDest){
        int temp = array[indexDest];
        array[indexDest]=array[indexOrig];
        array[indexOrig] = temp;
    }


    public static int trovaIndexMinimo(int[] array, int indice){
        int indexMinTemp=indice;
        for (int x=indice+1; x<(array.length); x++){
            if(array[x]<array[indexMinTemp]) indexMinTemp=x;
            numeroPassi++;
        }

        return indexMinTemp;
    }



    /**
     restituisci un array di numeri genearati randomicamente

     @param numeroElementi il numero di elementi che compone l'array
     @return array di lunghezza pari a numeroElementi
     */
    public static int[] generaArray(int numeroElementi){
        int[] array = new int[numeroElementi];

        for (int x=0; x< numeroElementi; x++){

            //genero un valore compreso tra 0 e numeroElementi*2 cosi da permettere la generazione di doppioni
            int numeroRandom=(int)(Math.random()*numeroElementi*2);
            array[x] = numeroRandom;
        }

        return array;

    }




}
