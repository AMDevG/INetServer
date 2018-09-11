/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inetserver;

/**
 *
 * @author jberr
 */

import java.io.*;
import java.net.*;

class Worker extends Thread{
    Socket sock;
    Worker (Socket s) {sock = s;}


public void run(){

    PrintStream out = null;
    BufferedReader in = null;
    
    try{
        in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        out = new PrintStream(sock.getOutputStream());
    try{
        String name;
        name = in.readLine();
        System.out.println("Looking up: " + name);
        printRemoteAddress(name, out);
    } catch (IOException x){
        System.out.println("Server read error");
        x.printStackTrace();
    }
    sock.close();
    }catch(IOException ioe){System.out.println(ioe);
    }
}








public class InetServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
