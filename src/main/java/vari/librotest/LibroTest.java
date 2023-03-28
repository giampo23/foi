package vari.librotest;


import java.util.*;


public class LibroTest {

    static int numeroLibriDaInserire = 3;


    static ArrayList<Libro> libreria = new ArrayList<Libro>();
    static Scanner tastiera = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Benvenuto in biblioteca, inserisci tre libri");


        for (int x = 1; x <= numeroLibriDaInserire; x++) {

            Libro libro = creaLibroDaInput(x);

            libreria.add(libro);



        }



        Collections.sort(libreria, new AnnoComparator());
        System.out.println(libreria);


    }


    private static Libro creaLibroDaInput(int numeroLibro) {


        System.out.println("Inserisci i dati del libro n. " + numeroLibro);

        //System.out.println("Titolo:");
        //String titolo = tastiera.nextLine();
        String titolo = "titolo " + numeroLibro;

        //System.out.println("Autore:");
        //String autore = tastiera.nextLine();
        String autore = "autore " + numeroLibro;

        boolean erroreInputAnno;
        int anno = 0;
        do {
            erroreInputAnno=false;
            System.out.println("Anno pubblicazione:");

            try {
                anno = tastiera.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("devi inserire solo lettere");
                erroreInputAnno = true;
            }
            tastiera.nextLine();
        }
        while (erroreInputAnno);


        Libro libro = new Libro(titolo, autore, anno);
        return libro;


    }

    static class AnnoComparator implements Comparator<Libro>{

        @Override
        public int compare(Libro o1, Libro o2) {
            if(o1.getAnno()>o2.getAnno()) return 1;
                else return -1;


            ///return Integer.compare(o1.getAnno(),o2.getAnno());
        }
    }




}

