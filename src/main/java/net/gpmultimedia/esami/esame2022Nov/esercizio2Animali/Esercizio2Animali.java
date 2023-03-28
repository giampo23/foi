package net.gpmultimedia.esami.esame2022Nov.esercizio2Animali;

import java.util.*;
public class Esercizio2Animali{
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Animale> animali = new ArrayList<>();

    public static void main (String[] args){


        System.out.println("Inserisci i dati di 3 animali ");

        for(int x=1; x<=3; x++){
            System.out.println("Inserisci i dati dell'animale n. " + x);

            //inserira stringa non vuota per nome

            String nome_scientidico = inserisciStringNonVuota("nome scientifico animale " + x + ": ");
            String nome_comune = inserisciStringNonVuota("nome comune animale " + x + ": ");
            int eta = inserisciUnIntero("eta animale " + x + ": ");
            int peso = inserisciUnIntero("peso animale " + x + ": ");

            Animale animale = new Animale(nome_scientidico,nome_comune , eta, peso);
            animali.add(animale);
        }

        System.out.println("Tutti gli animali sono stati inseriti");

        printMenu();







        boolean ripeti =true;
        while(ripeti ){
            int scelta = inserisciUnIntero("digita un numero");
            switch (scelta){
                case 1:
                    System.out.println("Lista ordinata per Nomescientifico decrescente");
                    Collections.sort(animali, new NomeScientificoComparator());
                    Collections.reverse(animali);
                    stampaLista();
                    break;
                case 2:
                    System.out.println("Lista ordinata per nome comune crescente ");
                    Collections.sort(animali, new NomeComuneComparator());
                    stampaLista();

                    break;
                case 3:
                    System.out.println("Lista ordinata per peso crescente");

                    Collections.sort(animali, new PesoComparator());

                    stampaLista();

                    break;
                case 4:
                    System.out.println("Lista ordinata per peso decrescente ");
                    Collections.sort(animali, new PesoComparator());
                    Collections.reverse(animali);
                    stampaLista();

                    break;
                case 5:
                    ripeti=false;
                    System.out.println("ciao ciaooooooo!");
                    break;
                default:
                    break;
            }


        }



    }



    public static void stampaLista(){
        Iterator<Animale> it=animali.iterator();

        while(it.hasNext()){
            Animale animale=it.next();
            System.out.println(animale);
        }
    }

    public static void printMenu(){
        System.out.println("Che vuoi fare?premi:");
        System.out.println("1 - stampa lista ordinata per nome scientidfico decrescente.");
        System.out.println("2 - stampa lista ordinata per nome comune crescente");
        System.out.println("3 - stampa lista ordinata per peso crescente");
        System.out.println("4 - stampa lista ordinata per peso decrescente");
        System.out.println("5 - per uscire dal programma.");



    }

    public static String inserisciStringNonVuota(String label){
        System.out.println(label);
        String txt="";
        boolean errore = true;
        while(errore){
            txt= scanner.nextLine();
            if(txt.isEmpty()){
                System.out.println("Attenzione inserisci una stringa non vuota.");
                System.out.println(label);
            }else{
                errore=false;
            }
        }

        return txt;
    }

    public static int inserisciUnIntero(String label){
        System.out.println(label);
        int numero=0;
        boolean errore = true;
        while(errore){
            String txt= scanner.nextLine();

            try {
                numero = Integer.parseInt(txt);
                errore=false;
            }
            catch(Exception e){
                System.out.println("Attenzione inserisci un numero.");
                System.out.println(label);
            }
        }

        return numero;

    }



}


