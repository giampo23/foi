package vari.sockettest1;

import java.util.Scanner;

public class SocketTest {

    public static void main(String[] args) {

        ServerTest serverTest=new ServerTest();
        ClentTest clentTest = new ClentTest();

        Scanner input = new Scanner(System.in);

        boolean exit=false;
        System.out.println("");
        System.out.println("manda qualcosa al server");

        do {
            String testo = input.nextLine();
            clentTest.sendMessage(testo);


            if(testo.equalsIgnoreCase("exit")){
                exit=true;
            }


        }while (!exit);


        serverTest.stop();


    }





}
