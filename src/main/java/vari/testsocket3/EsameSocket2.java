package vari.testsocket3;







//EsameSocket2.java

import java.io.*;
import java.net.*;

public class EsameSocket2{

    private static final int PORTA=3333;

    static ServerSocket server;
    static Socket client;


    public static void main (String[] args){

        ServerTest serverTest= new ServerTest();




        try {

            InetAddress ip = InetAddress.getByName("localhost");
            InetSocketAddress address=new InetSocketAddress(ip,PORTA);


            while(true){
                client= new Socket();
                client.connect(address,2000);
                BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                w.write("n\n");

                w.flush();

                String rispostaDalServer=clientReader.readLine();
                System.out.println("CLIENT: il server dice: '" + rispostaDalServer + "' ");






            }






        } catch (UnknownHostException e) {
            System.out.println("errore " + e);
            throw new RuntimeException(e);
        }catch (IOException e) {
            System.out.println("errore " + e);
            throw new RuntimeException(e);
        }


    }


    private static void startServer(){


        try {
            server = new ServerSocket(PORTA);
            System.out.println("SERVER: socket server started sulla porta " + PORTA);


            while(true){

                Socket socket=server.accept();

                BufferedReader sReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));

                System.out.println("SERVER- arrivata connessione da un client sul socket: " + socket.getInetAddress() + ":" + socket.getPort());

                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

                String s=sReader.readLine();
                System.out.println("SERVER- ricevuto  dal client: " + s);

                writer.write("ciao" + "\n");
                writer.println("ciao" + "\n");


                if(s.equalsIgnoreCase("n")){

                    int numeroRandom=(int)(Math.random()*100);
                    System.out.println("SERVER- arrivata connessione da un client sul socket: " + socket.getInetAddress() + ":" + socket.getPort());
                    System.out.println("SERVER- invio numero random: " + numeroRandom);

                    String response="numero: " + numeroRandom;

                    writer.write(response + "\n");


                }

            }

        }
        catch(IOException e){
            System.out.println("errori nella connessione del server");
        }

    }


}