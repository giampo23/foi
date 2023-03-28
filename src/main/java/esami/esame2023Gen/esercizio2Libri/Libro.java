package esami.esame2023Gen.esercizio2Libri;





import java.util.*;
public class Libro{

    private String titolo;
    private String autore;
    private int anno;

    public Libro(String titolo, String autore, int anno){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }


    public static Libro creaLibroDaInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Titolo:");

        String titolo="";
        boolean richiediAncoraTitolo = true;
        do{
            titolo = scanner.nextLine();
            if(!titolo.isEmpty())richiediAncoraTitolo=false;
            else System.out.println("Attenzione il titolo non puo' essere vuoto.");

        }while(richiediAncoraTitolo);

        System.out.println("Autore:");
        String autore="";
        boolean richiediAncoraAutore = true;
        do{
            autore = scanner.nextLine();
            if(!autore.isEmpty()) richiediAncoraAutore=false;
            else System.out.println("Attenzione l'autore non puo' essere vuoto.");
        }while(richiediAncoraAutore);

        System.out.println("anno:");
        int anno = 0;
        boolean richiediAncoraAnno = true;
        do{
            String annoTxt = scanner.nextLine();
            try{
                anno = Integer.parseInt(annoTxt);
                richiediAncoraAnno = false;
            }catch(Exception e){
                System.out.println("Attenzione Devi digitare un numero.");
            }
        }while(richiediAncoraAnno);


        return new Libro(titolo,autore,anno);
    }


    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public int getAnno(){
        return this.anno;
    }

}



