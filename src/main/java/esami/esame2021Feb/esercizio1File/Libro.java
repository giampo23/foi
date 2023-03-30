package esami.esame2021Feb.esercizio1File;

public class Libro {

    String titolo;
    int pagine;


    public Libro(String titolo, int pagine){
        this.titolo = titolo;
        this.pagine=pagine;
    }

    public static Libro createFromLineLibro (String lineFromFile, String separator){
        String[] librotx = lineFromFile.split(separator);
        String titolo  =librotx[0];
        int pagine  = Integer.parseInt(librotx[1]);
        return new Libro(titolo ,pagine );
    }

    public String getTitolo(){
        return this.titolo;
    }
    public int getPagine(){
        return this.pagine;
    }

}