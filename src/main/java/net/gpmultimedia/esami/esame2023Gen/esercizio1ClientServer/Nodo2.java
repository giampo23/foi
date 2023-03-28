package net.gpmultimedia.esami.esame2023Gen.esercizio1ClientServer;


import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Nodo2 implements Runnable {

    private int porta;
    private static final int NUMERI_IN_INPUT = 3;
    private Thread tNodo2;
    private ServerSocket socketServer;
    private ArrayList<Integer> numeri = new ArrayList<>();


    public Nodo2(int porta) {
        this.porta = porta;
        tNodo2 = new Thread(this, "tnodo2");
        tNodo2.start();
    }


    @Override
    public void run() {
        try {
            this.socketServer = new ServerSocket(this.porta);
            System.out.println("[NODO2-CLIENT-SERVER] started on port: " + this.porta);


            Socket socket = socketServer.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            int numeriRicevuti = 0;
            int somma = 0;

            do {
                String linea = reader.readLine();
                int numero = Integer.parseInt(linea);


                writer.write("sono NODO2-CLIENT-SERVER e ho ricevuto ha ricevuto: " + numero + "");
                writer.newLine();
                writer.flush();
                numeriRicevuti+=1;
                numeri.add(numero);

                somma += numero;


            } while (numeriRicevuti< NUMERI_IN_INPUT);

            //conto
            double average = somma / NUMERI_IN_INPUT;

            System.out.println("[NODO2-CLIENT-SERVER] ho calcolato la media:" + average);
            //istanzio un client che si connette al server 3 e gli invia l'average

            InetAddress ip = InetAddress.getByName("localhost");
            SocketAddress sa = new InetSocketAddress(ip,9001);
            Socket client2 = new Socket();
            client2.connect(sa,2000);
            BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(client2.getOutputStream()));
            bw.write(""+average);
            bw.newLine();
            bw.flush();
            bw.close();
            client2.close();




            writer.close();
            socket.close();
            socketServer.close();


        } catch (IOException e) {
            System.out.println("errorin in connessione" + e.toString());
            throw new RuntimeException(e);
        }

    }
}
