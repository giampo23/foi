package vari.testsocket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest implements Runnable{

    ServerSocket server;
    Thread thread;

    public ServerTest(){

            thread=new Thread(this,"server");
            thread.start();
    }

    @Override
    public void run() {

        try {
            server = new ServerSocket(3333);

            while (true){

                Socket socket = server.accept();
                BufferedReader r= new BufferedReader(new InputStreamReader(socket.getInputStream()));

                System.out.println("SERVER- arrivata connessione da un client sul socket: " + socket.getInetAddress() + ":" + socket.getPort());

                String s = r.readLine();

                System.out.println("CLIENT inviato: " + s);



            }





        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
