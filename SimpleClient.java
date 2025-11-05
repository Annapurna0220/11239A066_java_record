import java.io.*;
import java.net.*;

class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello, Server!");
        dout.flush();

        dout.close();
        s.close();
    }
}
