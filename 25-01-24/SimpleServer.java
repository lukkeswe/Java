import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(5001);
            while(true){
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println("こんにちは。私はサーバーです。");
                writer.close();
            }
        } catch(IOException e){
            System.out.println(e);
        }
        
    }
}
