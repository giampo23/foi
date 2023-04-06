package esami.Esame2023Aprile.esercizio2Studenti;




//Studente.java
import java.util.*;

public class Studente{
    String nome;
    int matricola;
    int eta;
    HashMap<String,Integer> esami=new HashMap<>();

    public Studente (String nome, int matricola, int eta){
        this.nome=nome;
        this.matricola= matricola;
        this.eta=eta;
    }





    public String getNome(){
        return this.nome;
    }


    public int getMatricola(){
        return this.matricola;
    }

    public int getEta(){
        return this.eta;
    }

    public double getMedia(){

        Collection<Integer> voti= esami.values();
        int somma=0;
        Iterator<Integer> it=voti.iterator();
        while(it.hasNext()){
            Integer voto = it.next();
            somma+=voto.intValue();
        }

        double media=somma/esami.size();
        return  media;
    }

    public void addEsame(String esame, int voto){
        this.esami.put(esame, voto);
    }


    public static class MatricolaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente studente1, Studente studente2){
            if(studente1.getMatricola()>studente2.getMatricola()) return 1;
            else  return -1;
        }
    }//fine comparator matricola

    public static class EtaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente studente1, Studente studente2){
            if(studente1.getEta()>studente2.getEta()) return 1;
            else  return -1;
        }
    }//fine comparator eta

    public static class MediaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente studente1, Studente studente2){
            if(studente1.getMedia()>studente2.getMedia()) return 1;
            else  return -1;
        }
    }//fine comparator media


}//fine class Studente






