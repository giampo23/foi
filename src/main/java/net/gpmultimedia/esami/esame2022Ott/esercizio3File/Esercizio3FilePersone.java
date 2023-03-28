package net.gpmultimedia.esami.esame2022Ott.esercizio3File;


import java.io.*;
import java.util.*;

public class Esercizio3FilePersone {

    public static void main (String[] args){
        String path = "/INSERIRE/PATH/DEL/file.txt";

        try{
            File file = new File(path);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            Scanner scanner = new Scanner(System.in);

            for (int x=0;x<3; x++){
                System.out.println("Inserisci la persona numero " + x);

                System.out.println("Nome: ");
                boolean richiediNome=true;
                String nome="";
                do {
                    nome=scanner.nextLine();
                    if(!nome.isEmpty()) richiediNome = false;

                }while(richiediNome);

                System.out.println("Cognome: ");
                boolean richiediCognome=true;
                String cognome="";
                do {
                    cognome=scanner.nextLine();
                    if(!cognome.isEmpty()) richiediCognome = false;

                }while(richiediCognome);


                writer.write(nome + "___" + cognome);
                writer.newLine();
                writer.flush();


            }
            writer.close();


            BufferedReader reader = new BufferedReader(new FileReader(file));


            String persona;
            while( (persona = reader.readLine())!=null  ){

                String[] splitted=persona.split("___");
                System.out.println("Cognome: " + splitted[1]);

            }











        } catch(FileNotFoundException e){
            System.err.println("Attenzione file \"" + path + "\"  non trovato.");
        } catch(IOException e){
            System.err.println("Attenzione impossibile lavorare sul file: " + path);
        }




    }




}