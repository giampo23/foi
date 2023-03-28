package vari.sockettest2;


import java.net.*;
import java.util.*;
import java.io.*;

//Nodo2
public class Nodo2 implements Runnable{

    private Thread threadServer;
    private ServerSocket server;
    ArrayList<Integer> numeri = new ArrayList<Integer>();

    private int porta;

    public Nodo2(int porta){

        this.porta=porta;
        threadServer = new Thread(this, "threadNode2");
        threadServer.start();
    }


    @Override
    public void run(){

        try {
            server = new ServerSocket(this.porta);
            System.out.println("Server started on port " + porta);


            boolean exit = false;

            //inizio il loop in  attesa dei messaggi dai client

            int numeriAttesi=3;


            do{
                Socket socket = server.accept();
                //prendo l'input
                BufferedReader ins = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String cmd = ins.readLine();

                if(cmd.equalsIgnoreCase("exit")){
                    exit=true;
                }else{
                    int numero = Integer.parseInt(cmd);
                    numeri.add(numero);

                    //scrivo sul socket
                    OutputStream out = socket.getOutputStream();
                    String response = "Node2: ho ricevuto il numero: " + numero;
                    out.write(response.getBytes("UTF-8"));
                    out.flush();

                    System.out.println("soze: " + numeri.size());
                    if(numeri.size()==numeriAttesi){
                        exit=true;
                        //ho ricevuto i numeri, devo calcolare la media e creare un client che
                        //invii al node3

                        int sum=0;
                        Iterator<Integer> iterator = numeri.iterator();
                        while(iterator.hasNext()){
                            sum+=iterator.next();
                        }

                        double average = sum/numeriAttesi;
                        System.out.println("average: " + average);


                        System.out.println("chiuso un socket sul node2");

                        socket.close();


                    }
                }





            }while(!exit);

            System.out.println("chiudo il node2");
            server.close();


        }catch(Exception e){
            System.out.println("probbblemi " +  e.toString());

        }




    }

}