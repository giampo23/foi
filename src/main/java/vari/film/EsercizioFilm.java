package vari.film;





import java.util.*;
//EsercizioFilm.js
public class EsercizioFilm{

    private static HashSet<Film> collezione = new HashSet<Film>();
    private static Scanner scan = new Scanner(System.in);



    public static void main (String[] args){



        int quantiFilmInserire = chiediQuantiFilmInserire();

        int numeroFilmInInserimento = 1;
        while(collezione.size()<quantiFilmInserire){

            Film film = Film.richiediInserimentoFilm(numeroFilmInInserimento);
            collezione.add(film);
            numeroFilmInInserimento++;

        }
        System.out.println("hai inserito tutti i film.");


        Iterator<Film> iterator = collezione.iterator();

        while (iterator.hasNext()){
            Film f = iterator.next();

            System.out.println("Film: " + f.getTitolo() + " - anno:" + f.getAnno());

        }



        List<Film> list = new ArrayList<Film>(collezione);
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitolo().compareTo(o2.getTitolo());
            }
        });



        System.out.println(list);




    }

    public static int chiediQuantiFilmInserire(){



        int number = 0;
        boolean devoChiedereAncora=false;
        do{

            String inputRicevuto = scan.nextLine();
            try{
                number = Integer.parseInt(inputRicevuto);



            }catch(Exception e){
                devoChiedereAncora=true;
                System.out.println("attenzione devi digitare un numero");
            }



        }while(devoChiedereAncora);



        return number;

    }



}
