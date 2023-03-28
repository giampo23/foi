package vari.librotest;

//Libro.java
public class Libro{
    private String titolo;
    private String autore;
    private int anno_pubblicazione;


    public Libro(String _titolo, String _autore, int _anno_pubblicazione){
        this.titolo = _titolo;
        this.autore = _autore;
        this.anno_pubblicazione = _anno_pubblicazione;
    }


    public String toString(){
        return this.anno_pubblicazione + " (autore: " + this.autore + " ) - anno: " + this.anno_pubblicazione;
    }


    public int getAnno() {
        return this.anno_pubblicazione;
    }
}