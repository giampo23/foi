package esami.Esame2023Aprile.esercizio2Studenti;





import java.util.*;
public class ProgrammaStudenti{
    public static ArrayList studenti = new ArrayList();
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args){


        System.out.println("benvenuto,  inserisci tre studenti.");

        for (int x=1; x<=3; x++){
            System.out.println("Inserisci i dati dello studente N." + x);
            String nome = inserisciStringaNonVuota("Inserisci il nome dello studente n." + x);
            int matricola = inserisciNumero("Inserisci la matricola dello studente n." + x);
            int eta = inserisciNumero("Inserisci eta' dello studente n." + x);
            Studente studente = new Studente(nome, matricola, eta);

            int numeroEsami= inserisciNumero("Quanti esami vuoi inserire per " + nome + "?");
            //TODO: possibile controllo su numero (max e minimo)del numero degli esami
            for (int y=1; y<=numeroEsami; y++){
                String esame = inserisciStringaNonVuota("Inserisci esame n." + 1 + " per " + nome);
                int voto= inserisciNumero("Inserisci il voto per l'esame " + esame);
                studente.addEsame(esame, voto);
            }
            studenti.add(studente);

        }//fine ciclo for inserimento studenti

        System.out.println("Ok, hai inserito tutti gli studenti, ora che vuoi fare?");
        printMenu();

        boolean continua = true;
        while (continua){
            int scelta = inserisciNumero("inserisci un numero" );
            switch(scelta){
                case 1:
                    System.out.println("Ecco la lista ordinata per media matricola decrescente");
                    Collections.sort(studenti, new Studente.MatricolaComparator() );
                    Collections.reverse(studenti);
                    stampaLista();
                    printMenu();
                    break;
                case 2:
                    System.out.println("Ecco la lista ordinata per media eta' crescente");
                    Collections.sort(studenti, new Studente.EtaComparator () );
                    stampaLista();
                    printMenu();
                    break;
                case 3:
                    System.out.println("Ecco la lista ordinata per media esami crescente");
                    Collections.sort(studenti, new Studente.MediaComparator () );
                    Collections.reverse(studenti);
                    stampaLista();
                    printMenu();
                    break;
                case 4:
                    continua=false;
                    System.out.println("Ciao Ciao!");
                    break;
                default:
                    System.out.println("devi Digita un numero tra 1 e 4!");
                    printMenu();
                    break;
            }//fine switch

        }//fine del while




    }//fine main


    public static void stampaLista(){
        Iterator<Studente> iterator = studenti.iterator();
        while(iterator.hasNext()){
            Studente studente = iterator.next();
            System.out.println("Studente " + studente.getNome() + " , matr. " + studente.getMatricola() + ", eta: " + studente.getEta() + ",  media esami: " + studente.getMedia() );
        }

    }//fine stampaLista

    public static void printMenu(){
        System.out.println("Digita un numero tra 1 e 4 per: ");
        System.out.println("1 - per la lista degli studenti ordinata per matricola decrescente");
        System.out.println("2 - per la lista degli studenti ordinata per eta' crescente ");
        System.out.println("3 - per la lista degli studenti ordinata per media esame piu alta");
        System.out.println("4 - uscire dal programma");
    }




    public static String inserisciStringaNonVuota(String label){
        System.out.println(label);
        String txt="";
        boolean errore=true;
        while (errore){
            txt=scanner.nextLine();
            if(txt.isEmpty()){
                System.out.println("Attenzione, inserira un testo.");
                System.out.println(label);
            }
            else{
                errore=false;
            }

        }
        return txt;

    }//fine inserisciStringaNonVuota



    public static int inserisciNumero(String label){
        System.out.println(label);
        int numero=-1;
        boolean errore=true;
        while(errore){
            String txt= scanner.nextLine();
            try{
                numero = Integer.parseInt(txt);
                errore=false;
            } catch (NumberFormatException e){
                System.out.println("Attenzione inserire un numero intero");
                System.out.println(label);
            }
        }

        return numero;
    }//fine inserisciNumero


}//fine ProgrammaStudenti


