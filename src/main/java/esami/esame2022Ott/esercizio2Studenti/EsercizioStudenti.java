package esami.esame2022Ott.esercizio2Studenti;






import java.util.*;
public class EsercizioStudenti{

    static ArrayList<Studente> studenti = new ArrayList<>();
    public static void main(String[] args){

        System.out.println("Benvenuto in 'SEGRETERIA4.0', cosa vuoi che faccia?");

        //popolo i dati del programma
        setupIniziale();

        //stampo il
        printMenu();


        //mi preparo a ricevere la scelta dell'utente
        Scanner scanner = new Scanner(System.in);

        //finche l'utente non decide di uscire o compie delle scelte errate, sto in attesda di input
        boolean continua=true;

        while (continua){

            String inputTxt = scanner.nextLine();
            int input=0;
            try{
                input = Integer.parseInt(inputTxt);
                if(input>0 && input<4){//sono le scelte che portano alla stampa della lista
                    stampaLista(input);
                    printMenu();
                }
                else if(input==4){//con queta scelta esco dal programma
                    System.out.println("bye bye!");
                    continua=false;
                }
                else {//l'utente ha digitato un numero ma nessuna azione e' associata
                    System.out.println("Attenzione digita un numero da 1 a 4!");
                }
            }
            catch(Exception e){
                //l'utente ha inserito una sstringa invece che un numero
                System.out.println("Attenzione digita un numero da 1 a 4!");
            }



        }




    }

    /**
     il metodo si occupa di popolare la lista degli studenti con dei dati di base

     */
    public static void setupIniziale(){


        Studente mario = new Studente("Mario", 2341, 40);
        mario.addEsame("matematica1", 23);
        mario.addEsame("fondamenti di informatica",30);
        studenti.add(mario);

        Studente paolo = new Studente("Mario", 5665, 22);
        paolo.addEsame("economia",30);
        paolo.addEsame("inglese",29);
        paolo.addEsame("matematica1",26);
        paolo.addEsame("matematica2",25);
        studenti.add(paolo);


        Studente gigi = new Studente("gigi", 8765, 25);
        gigi.addEsame("fisica",25);
        gigi.addEsame("economia aziendale",23);
        gigi.addEsame("reti logiche",28);
        studenti.add(gigi);


    }

    /**
     la funzione stampa a video la lista degli utenti sulla base della scelta dell'utente
     @param int il tipo di ordinamento scelto dall'utente

     */
    public static void stampaLista(int ordinamento){

        switch (ordinamento){
            case 1:
                System.out.println("lista studenti ordinata per Matricola decrescente");


                Collections.sort(studenti, new Studente.MatricolaComparator());
                Collections.reverse(studenti);
                break;
            case 2:
                System.out.println("lista studenti ordinata per Eta' crescente");
                Collections.sort(studenti, new Studente.EtaComparator());

                break;
            case 3:
                System.out.println("lista studenti ordinata per media decrescente");
                Collections.sort(studenti, new Studente.MediaComparator());
                Collections.reverse(studenti);
                break;


        }

        Iterator<Studente> iteratorStudenti=studenti.iterator();
        while(iteratorStudenti.hasNext()){
            Studente studente = iteratorStudenti.next();
            System.out.println("" + studente.getNome() + "( mat."+ studente.getMatricola() +") | eta: " + studente.getEta() + " | media:" + studente.getMedia());
        }



    }



    public static void printMenu(){
        System.out.println("Digita un numero da 1 a 4:");
        System.out.println("- digita 1 per visualizzare gli studenti in ordine Matricola decrescente");
        System.out.println("- digita 2 per visualizzare gli studenti in ordine Eta' crescente");
        System.out.println("- digita 3 per visualizzare gli studenti in ordine di media decrescente");
        System.out.println("- digita 4 per uscire dal programma");

    }


}

