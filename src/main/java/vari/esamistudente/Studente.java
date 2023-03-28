package vari.esamistudente;



import java.util.*;

//Studente.java
public class Studente{
    String nome;
    int matricola;
    int eta;
    HashMap<String,Integer>esami = new HashMap<>();

    public Studente(String nome, int matricola, int eta){
        this.nome = nome ;
        this.matricola = matricola;
        this.eta = eta;
    }

    public void addEsame(String esame, int voto){
        esami.put(esame,voto);
    }

    public String getNome(){
        return this.nome;
    }

    public int getEta(){
        return this.eta;
    }
    public int getMatricola(){
        return this.matricola;
    }

    public float getMediaEsami(){

        int sum=0;
        for (int voto : esami.values()) {
            sum+=voto;
        }

        float media = sum/esami.size();

        return media;
    }

}


