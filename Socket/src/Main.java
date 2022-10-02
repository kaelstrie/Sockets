import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            Socket socket = new Socket("localhost", 4004);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(in.readLine());

            in.close();
            socket.close();
            reader.close();
        }
        catch (IOException e){
            System.out.println("Ошибка");
        }
    }
}