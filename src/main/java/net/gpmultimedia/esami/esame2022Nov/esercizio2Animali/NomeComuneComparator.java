package net.gpmultimedia.esami.esame2022Nov.esercizio2Animali;

import java.util.*;
public class NomeComuneComparator implements Comparator<Animale>{
    @Override
    public int compare(Animale a1, Animale a2){
        return a1.getNomeComune().compareTo(a2.getNomeComune());
    }
}

