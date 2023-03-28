package net.gpmultimedia.esami.esame2023Gen.esercizio2Libri;

import java.util.*;

public class LibroComparator implements Comparator<Libro>{

    @Override
    public int compare (Libro libro1, Libro libro2){
        if(libro1.getAnno()>libro2.getAnno()) return 1;
        else return -1;
    }

}