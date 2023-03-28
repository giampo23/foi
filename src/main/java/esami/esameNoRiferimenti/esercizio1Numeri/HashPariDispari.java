package esami.esameNoRiferimenti.esercizio1Numeri;





import java.util.*;


//HashPariDispari.java
public class HashPariDispari{
    static HashSet<Integer> listaOriginale=new HashSet<Integer>(1500);

    public static void main (String[] args){

        //popolo la lista
        for(int x=0;x<1500; x++){
            int numeroRandom = (int)(Math.random()*100);
            listaOriginale.add(numeroRandom);
            //System.out.println("n." + x + "="+numeroRandom);

        }

        ArrayList<Integer> pari = new ArrayList<>();
        ArrayList<Integer> dispari = new ArrayList<>();


        Iterator<Integer> iterator = listaOriginale.iterator();
        while(iterator.hasNext()){
            int numero = iterator.next();

            if(!pari.contains(numero) && !dispari.contains(numero)){
                if((numero % 2)==0) pari.add(numero);
                else dispari.add(numero);
            }
        }

        Collections.sort(pari);
        Collections.sort(dispari, Collections.reverseOrder());



        System.out.println("Questa e' la lista originale:");
        System.out.println(listaOriginale);
        System.out.println("##############################");

        System.out.println("Questa e' la lista dei numeri pari ordinata in maniera crescente:");
        System.out.println(pari);
        System.out.println("##############################");

        System.out.println("Questa e' la lista dei numeri dispari ordinata in maniera decrescente:");
        System.out.println(dispari);
        System.out.println("##############################");






    }



}