package vari.sockettest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest implements Runnable{

    private Thread tServer;
    private static final int PORT = 7777;
    private ServerSocket serverSocket;


    public ServerTest(){

        tServer = new Thread(this, "ServerBiblio Thread");
        System.out.println("Starting:"+ tServer.getName());
        tServer.start();

    }

    @Override
    public void run() {

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server Started! Address: " + serverSocket.getInetAddress() + "PORT: " + PORT);
            boolean exit = false;
            do {
                Socket socket = serverSocket.accept();
                BufferedReader ins = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String parameter = ins.readLine();

                if(!parameter.equalsIgnoreCase("exit")){
                    System.out.println("List of Magazines with status = " + parameter);
                    System.out.println("Socket accepted from host: " + socket.getInetAddress() + " PORT: " + socket.getLocalPort());

                    String response = "#### Hello client from address: " + socket.getInetAddress() + " on port " + socket.getPort() + "\r\n";
                    response += "#### This is " + socket.getLocalAddress() + " on port " + socket.getLocalPort()+ "\r\n";
                    OutputStream out = socket.getOutputStream();
                    out.write(response.getBytes("US-ASCII"));
                    out.flush();
                    socket.close();


                }else{
                    exit = true;
                    String response = "Server closed. Bye Bye\r\n";
                    OutputStream out = socket.getOutputStream();
                    out.write(response.getBytes("US-ASCII"));
                    out.flush();
                    socket.close();

                }


            } while (!exit);
            serverSocket.close();
            Thread.currentThread().interrupt();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public void stop() {
        try {
            Thread.currentThread().interrupt();
            System.out.println("Stop server completed");
        }catch (Exception e) {
            System.out.println("Stop Server ERROR: " + e);
        }
    }
}
