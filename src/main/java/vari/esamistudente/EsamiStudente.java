package vari.esamistudente;

import java.util.*;
public class EsamiStudente{

    static  ArrayList<Studente> studenti=new ArrayList<>();


    public static void main (String[] args){

        setupStudenti();


        Iterator<Studente> it= studenti.iterator();
        while(it.hasNext()){
            Studente studente = it.next();
            System.out.println(studente.getNome() + " - eta: " + studente.getEta() + " - media: " + studente.getMediaEsami() );
        }

    }


    public static void setupStudenti(){

        Studente mario=new Studente("Mario Rossi", 123, 22);
        mario.addEsame("fisica",23);
        mario.addEsame("economia",25);
        mario.addEsame("fondamenti informatica",27);
        mario.addEsame("matematica1",28);
        studenti.add(mario);

        Studente paolo= new Studente("Paolo Bianchi", 456, 34);
        paolo.addEsame("fisica",29);
        paolo.addEsame("matematica",30);
        paolo.addEsame("matematica2",28);
        studenti.add(paolo);


        Studente filippo=new Studente("Filippo Verdi", 789, 27);
        filippo.addEsame("fisica",29);
        filippo.addEsame("economia",18);
        filippo.addEsame("fondamenti informatica",20);
        filippo.addEsame("matematica1",21);
        studenti.add(filippo);


    }



}

