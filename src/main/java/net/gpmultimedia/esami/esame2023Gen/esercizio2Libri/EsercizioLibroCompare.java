package net.gpmultimedia.esami.esame2023Gen.esercizio2Libri;


import java.util.*;
public class EsercizioLibroCompare{
    static final int NUMERO_LIBRI_DA_INSERIRE=3;
    static ArrayList<Libro> libreria= new ArrayList<Libro>();

    public static void main (String[] args){

        System.out.println("Benvenuto, inserisci " + NUMERO_LIBRI_DA_INSERIRE + " libri." );
        while(libreria.size() < NUMERO_LIBRI_DA_INSERIRE){

            System.out.println("Inserisci i dati del libro n. " + (libreria.size()+1));

            Libro libro = Libro.creaLibroDaInput();

            libreria.add(libro);
        }

        Collections.sort(libreria, new LibroComparator());

        Iterator<Libro> it = libreria.iterator();
        while(it.hasNext()){
            Libro libro = it.next();
            System.out.println("Libro: " + libro.getTitolo() + " - anno: " + libro.getAnno());
        }


    }




}




