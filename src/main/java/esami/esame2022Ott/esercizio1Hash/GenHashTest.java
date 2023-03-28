
package esami.esame2022Ott.esercizio1Hash;

import java.util.*;
public class GenHashTest {


    public static void main(String[] args) {
        GenericHashMap<Integer, Number> genericHashMap=new GenericHashMap<>();




        int somma=0;
        double average=0;
        int keyMax=-1;


        for(int x=0;x<50; x++){
            int n = (int)(Math.random()*100);
            genericHashMap.put(x,n);
        }

        Set<Integer> keyset = genericHashMap.keySet();

        for (int key: keyset){
            Number value=genericHashMap.get(key);
            if(keyMax==-1 ||   genericHashMap.get(keyMax).floatValue() < value.floatValue() )
                keyMax = key;
            somma+= value.floatValue();
        }

        average = somma/genericHashMap.size();

        System.out.println("la somma e': " + somma);
        System.out.println("la media e': " + average);
        System.out.println("la chiave max e': " + keyMax);






        System.out.println("values: " + genericHashMap.values());
        System.out.println("chiavi: " + genericHashMap.keySet());
    }
}