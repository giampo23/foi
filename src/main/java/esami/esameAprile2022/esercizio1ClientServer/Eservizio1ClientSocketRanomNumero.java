package esami.esameAprile2022.esercizio1ClientServer;





import java.io.*;
import java.net.*;
public class Eservizio1ClientSocketRanomNumero {


    public static void main (String[] args){

        Server s = new Server();
        try{


            InetAddress address = InetAddress.getByName("localhost");
            InetSocketAddress sa = new InetSocketAddress(address,3333);






            Socket s1= new Socket();
            s1.connect(sa, 2000);


            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String stringaInviataDalServer = br.readLine();
            System.out.println("[client] il server dice: '" + stringaInviataDalServer + "'");

            br.close();
            s1.close();

        }catch (Exception e){

        }

    }


}

