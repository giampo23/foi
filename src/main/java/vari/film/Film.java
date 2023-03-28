package vari.film;


import java.util.*;

//Film.js
public class Film{
    private String titolo;
    private String regista;
    private int anno;


    public Film(String titolo, String regista, int anno){
        this.titolo = titolo;
        this.regista = regista;
        this.anno = anno ;
    }


    public static Film richiediInserimentoFilm(int x){

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i dati del film n." + x);
        System.out.println("titolo: ");
        String titolo = scan.nextLine();

        System.out.println("regista: ");
        String regista = scan.nextLine();



        boolean richiediAnno = true;

        int anno=0;


        System.out.println("anno:");


        do{
            String annoTxt = scan.nextLine();
            try{
                anno = Integer.parseInt(annoTxt);
                richiediAnno=false;


            }catch(Exception e ){
                System.out.println("attenzione devi digitare un numero");
            }

        }
        while(richiediAnno);


       return new Film(titolo,regista,anno);

}

    public String getTitolo(){
        return this.titolo;
    }
    public int getAnno(){
        return this.anno;
    }



}




