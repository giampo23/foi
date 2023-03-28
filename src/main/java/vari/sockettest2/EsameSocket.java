package vari.sockettest2;


import java.net.*;
import java.io.*;

public class EsameSocket {

    static final int PORT_NODE_2=9000;

    public static void main (String[] args){

        Nodo2 nodo2 = new Nodo2(PORT_NODE_2);



        try{
            //creo un client che invia tre numeri interi
            //per il client mi serve IP, e il socketAdress basato su IP
            InetAddress ip = InetAddress.getByName("localhost");
            InetSocketAddress socketAddress = new InetSocketAddress(ip,PORT_NODE_2);






            Socket client1 = new Socket();
            client1.connect(socketAddress,2000);

            DataInputStream network = new DataInputStream(client1.getInputStream());
            DataOutputStream message = new DataOutputStream(client1.getOutputStream());


            message.writeInt(23);
            message.flush();
            message.writeInt(23);
            message.flush();
            message.writeInt(23);
            message.flush();


            String line;

            while ((line = network.readUTF()) != null)
            {
                // Display the received message
                System.out.println(line);
            }




            System.out.println("END RESPONSE -----_");







        }catch(Exception e){
            System.out.println("errori nella connessiona al nodo2");

            System.out.println(e.toString());

        }











    }



    public void sendNumber(int numero){



    }




}
