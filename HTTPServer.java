
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class HTTPServer{
    public static void main(String[] args) throws Exception{
        final ServerSocket server = new ServerSocket(8000);
        System.out.println("Listening for connection on port 8000...");
        while(true){
            // get requests printed to console
           try(Socket client = server.accept()){
                Date today = new Date();
                String response = "HTTP/1.1 200 OK\r\n\r\n" + today;
                client.getOutputStream().write(response.getBytes("UTF-8"));

           }
           Socket client = server.accept();
            
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();
            while(!line.isEmpty()){
                System.out.println(line);
                line = reader.readLine();
            }

        }
        
    }
}