package esami.esameNoRiferimenti.eservizio3ServerData;


//ClienServerData.java
import java.net.*;
import java.util.*;
import java.io.*;

public class ClientServerData{
    public static void main (String[] args){
        Server server = new Server();

        try{

            InetAddress ip = InetAddress.getByName("localhost");
            InetSocketAddress address = new InetSocketAddress(ip, 3456);



            Scanner input = new Scanner(System.in);

            do{
                System.out.println("scrivi 'ciao' per ottenere la data dal server");
                String s=input.nextLine();
                if(s.equals("ciao")){

                    Socket client = new Socket();
                    client.connect(address,2000);
                    BufferedReader br = new BufferedReader (new InputStreamReader(client.getInputStream()));

                    String dataRicevuta= br.readLine();
                    System.out.println("il server dice che sono le ore: " + dataRicevuta);



                    client.close();


                }else{
                    System.out.println("Comando non riconoscito. scrivi 'ciao' per ottenere la data dal server");

                }



            }while(true);







        }catch(Exception e){
            System.err.println("qualcosa e' andato storto: " + e);
        }


    }
}