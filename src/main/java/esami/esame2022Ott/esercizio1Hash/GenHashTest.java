package esami.esame2022Ott.esercizio1Hash;

public class GenHashTest {


    public static void main(String[] args) {
        GenericHashMap<Integer, Number> genericHashMap=new GenericHashMap<>();




        int somma=0;
        double average=0;

        for(int x=0;x<50; x++){
            int n = (int)(Math.random()*100);
            genericHashMap.put(x,n);



        }


        System.out.println(genericHashMap.keySet());
    }
}
