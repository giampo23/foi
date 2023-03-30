package esami.esame2022Ott.esercizio2Studenti;





import java.util.*;

public class Studente{

    String nome;
    int matricola;
    int eta;
    HashMap<String, Integer> esami = new HashMap<>();


    public Studente(String nome, int matricola, int eta){
        this.nome = nome;
        this.matricola = matricola;
        this.eta = eta;
    }

    public void addEsame(String esame, int voto){
        esami.put(esame, voto);
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

        Set<String> chiavi = esami.keySet();
        int sum=0;
        for (String chiave: chiavi){
            sum+=esami.get(chiave);
        }

        return sum/esami.size();

    }



    public static class MatricolaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente s1, Studente s2){
            if(s1.getMatricola() > s2.getMatricola())return 1;
            else return -1;
        }
    }
    public static class EtaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente s1, Studente s2){
            if(s1.getEta() > s2.getEta())return 1;
            else return -1;
        }
    }
    public static class MediaComparator implements Comparator<Studente>{
        @Override
        public int compare(Studente s1, Studente s2){
            if(s1.getMedia() > s2.getMedia())return 1;
            else return -1;
        }
    }



}




