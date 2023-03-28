package esami.esame2022Nov.esercizio2Animali;

public class Animale{

    String nome_scientifico;
    String nome_comune;
    int eta;
    int peso;

    public Animale(String nome_scientifico, String nome_comune, int eta, int peso){
        this.nome_scientifico = nome_scientifico;
        this.nome_comune = nome_comune;
        this.eta = eta;
        this.peso = peso ;
    }


    public String getNomeScientifico(){
        return this.nome_scientifico ;
    }
    public String getNomeComune(){
        return this.nome_comune ;
    }
    public int getEta(){
        return this.eta ;
    }
    public int getPeso(){
        return this.peso ;
    }


    public String toString(){
        return "ns:  " + this.nome_scientifico + " | nc: " + this.nome_comune + " | eta:  " + this.eta + "| peso:  " + this.peso;
    }

}
