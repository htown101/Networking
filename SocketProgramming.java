/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;
import java.io.*;
import java.net.*;
/**
 *
 * @author H-Town
 */
public class SocketProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
//java socket client example
    Socket s = new Socket();
    String host = "www.google.com";
   
        try
        {
        s.connect(new InetSocketAddress(host , 80));
        }
        //Host not found
        catch (UnknownHostException e)
        {
            System.err.println("Don't know about host : " + host);
            System.exit(1);
        }
        System.out.println("Connected");
}
}
