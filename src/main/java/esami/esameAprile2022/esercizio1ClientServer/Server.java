package esami.esameAprile2022.esercizio1ClientServer;


import java.io.*;
import java.net.*;

public class Server implements Runnable {
    Thread thread;
    ServerSocket server;

    public Server() {
        thread = new Thread(this, "threadserver");
        thread.start();
    }


    @Override
    public void run() {

        try {
                server = new ServerSocket(3333);

            do {

                Socket socket = server.accept();
                System.out.println("[server] iniziata connessione da: " + socket);


                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                int random = (int)(Math.random()*100);
                w.write("Un caloroso benvenuto caro client!Ecco il tuo numero random: " + random);
                w.newLine();
                w.close();
                socket.close();


            } while (true);


        } catch (IOException e) {

        }


    }


}


