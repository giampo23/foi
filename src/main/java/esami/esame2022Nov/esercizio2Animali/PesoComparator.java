package esami.esame2022Nov.esercizio2Animali;
import java.util.*;

public class PesoComparator implements Comparator<Animale>{
    @Override
    public int compare(Animale a1, Animale a2){
        if(a1.getPeso()>a2.getPeso())return 1;
        else return -1;
    }
}

