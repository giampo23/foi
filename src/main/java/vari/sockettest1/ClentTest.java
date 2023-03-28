package vari.sockettest1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.*;

public class ClentTest {

    private static final int PORT = 7777;
    private InetAddress IP;
    private SocketAddress sockaddr;
    Socket socket = new Socket();
    int timeoutMs = 2000;


    public ClentTest() {
        try {
            IP = InetAddress.getByName("localhost");
            sockaddr = new InetSocketAddress(IP,PORT);
            System.out.println("Client Started!");



        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String status){

        try {
            socket = new Socket();
            socket.connect(sockaddr, timeoutMs);
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(status);

            int c = 0;
            InputStream is = socket.getInputStream();
            System.out.println("Server Response");
            while (c != -1) {
                c = is.read();
                if (c != -1) {
                    System.out.print((char) c);
                }
            }
            System.out.println("END RESPONSE -----_");
        }catch (IOException e) {

        }

    }


}
