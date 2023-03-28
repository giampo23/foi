package net.gpmultimedia.esami.esame2023Gen.esercizio1ClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Nodo3 implements Runnable{

    private int porta;
    private ServerSocket serverSocket;

    private Thread tNode3;
    public Nodo3(int porta){
        this.porta = porta;
        tNode3 = new Thread(this, "th nodo3");
        tNode3.start();
    }


    @Override
    public void run() {

        try{
            serverSocket = new ServerSocket(this.porta);
            System.out.println("[NODO3-SERVER] started on port: " + this.porta);

            Socket socket = serverSocket.accept();
            BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String media_ricevuta = r.readLine();


            System.out.println("[NODO3-SERVER]: ho rivevuto la media: " + media_ricevuta);

            socket.close();
            serverSocket.close();






        }catch (IOException e){
            System.out.println("errore IO nodo3" + e.toString());

        }

    }
}
