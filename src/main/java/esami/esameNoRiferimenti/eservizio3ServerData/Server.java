package esami.esameNoRiferimenti.eservizio3ServerData;






//Server.js

import java.net.*;
import java.io.*;
import java.util.*;

public class Server implements Runnable{

    ServerSocket server;
    Thread t;

    public Server(){
        t = new Thread(this,"serverthread");
        t.start();


    }



    @Override
    public void run(){

        try{
            server = new ServerSocket(3456);
            System.out.println("Server started sulla porta 3456");

            while(true){
                Socket socket = server.accept();
                BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Date date = new Date();

                System.out.println("SERVER: avvenuta connessione da client su indirizzo:" + socket.getInetAddress() + ":" + socket.getPort() + " alle ore " + date);
                wr.write(date + "\n");
                wr.flush();
                wr.close();
                socket.close();
            }




        }catch(Exception e){
            System.err.println("Qualcosa e' andato storto: " + e);

        }




    }


}