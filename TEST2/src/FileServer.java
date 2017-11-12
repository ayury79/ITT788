import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.*;
import java.io.*;

public class FileServer {
public static void main (String []args) {
               try { 
		      int port = 1999;
                      ServerSocket ss = new ServerSocket(port); 
                      Socket s = ss.accept(); 
		      DataInputStream dis = new DataInputStream(s.getInputStream()); 
                      String k = dis.readUTF(); 
		      

                      System.out.println("File Transferred"); 
		      FileWriter fw = new FileWriter("1_add.txt", true);
		      BufferedWriter bw = new BufferedWriter(fw);
		      bw.write(k);
                      bw.write("Harni binti Muhammad");
 		      bw.close();
                      
		      
                     } catch (IOException ie) { 
                       ie.printStackTrace(); 
                     }
          }
}