package esami.esame2022Nov.esercizio2Animali;


import java.util.*;
public class NomeScientificoComparator implements Comparator<Animale>{
    @Override
    public int compare(Animale a1, Animale a2){
        return a1.getNomeScientifico().compareTo(a2.getNomeScientifico());
    }
}
