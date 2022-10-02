import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            String message = "Привет";
            ServerSocket serverSocket = new ServerSocket(4004);
            Socket socket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            out.write(message);
            out.flush();

            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        }
        catch (IOException exception){
            System.out.println("Ошибка");
        }


    }
}