package esami.esame2023Gen.esercizio1ClientServer;

import java.io.*;
import java.net.*;

public class Esercizio1ClientServerMain {

    static final int PORT_NODO_2 = 9000;

    public static void main (String[] args){

        Nodo2 nodo2= new Nodo2(PORT_NODO_2);
        Nodo3 nodo3= new Nodo3(PORT_NODO_2+1);

        try{
            InetAddress ip = InetAddress.getByName("localhost");
            InetSocketAddress sa = new InetSocketAddress(ip,PORT_NODO_2);
            Socket client1 = new Socket();
            client1.connect(sa,2000);
            System.out.println("[NODO1-CLIENT] connessione avvenuta con " + sa + " sulla porta: "+ client1.getLocalPort());

            BufferedWriter w=new BufferedWriter(new OutputStreamWriter(client1.getOutputStream()));
            BufferedReader r=new BufferedReader(new InputStreamReader(client1.getInputStream()));


            w.write("23\n");
            w.flush();
            //w.newLine();
            w.write("24\n");
            w.flush();
            //w.newLine();
            w.write("25\n");
            //w.newLine();
            w.flush();

            int x=0;
            while (x<3){
                String responseLine = r.readLine();
                System.out.println("[NODO1]:  ho ricevuto da [NODO2-CLIENT-SERVER] il messaggio: \"" + responseLine + "\"");

                x++;
            }



            w.close();
            client1.close();





        }catch(UnknownHostException e){
            System.out.println("localhost non riconosciuto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
