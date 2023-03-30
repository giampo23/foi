package esami.esame2021Feb.esercizio1File;



import java.io.*;
import java.util.*;
public class Esercizio1File{

    static final String SEPARATOR = "________";
    static ArrayList<Libro> libri=new ArrayList<>();

    static String path = "E:\\Lavoro\\Java\\Progetti\\Foi\\esercizi\\libri.txt";

    public static void main(String[] args){
        popolaLibreria();
        scriviSulFile();
        estraiLibriFilterByPages(400);
    }//fine main


    public static void estraiLibriFilterByPages(int pages_number){

        try{
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while(  (line = reader.readLine()) !=null   ){
                Libro libro = Libro.createFromLineLibro(line, SEPARATOR);
                if(libro.getPagine()>pages_number)
                    System.out.println("" + libro.getTitolo() + " ||| " + libro.getPagine());

            }
            reader.close();




        }catch(Exception e){
            System.out.println("impossibile leggere dal file");


        }//fine try



    }


    public static void scriviSulFile(){



        //apro il file in scrittura
        try{
            File file = new File(path);

            BufferedWriter w = new BufferedWriter(new FileWriter(file));

            Iterator<Libro> it= libri.iterator();
            while(it.hasNext()){
                Libro libro= it.next();
                w.write(libro.getTitolo() + SEPARATOR + libro.getPagine());
                w.write("\n");
                w.flush();
            }
            w.close();


        }catch (Exception e){
            System.out.println("impossibile aprire il file");
        }





    }

    public static void popolaLibreria(){
        for(int x=1; x<=30 ; x++){

            String titolo = "Libro " + x;
            int pagine = (int)(Math.random()*500);

            Libro libro=new Libro(titolo, pagine);
            libri.add(libro);

        }
    }


}


