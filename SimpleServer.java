import java.io.*;
import java.net.*;

class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");
        Socket s = ss.accept(); // Wait for client connection
        System.out.println("Client connected!");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();
        System.out.println("Message from client: " + str);

        dis.close();
        s.close();
        ss.close();
    }
}
