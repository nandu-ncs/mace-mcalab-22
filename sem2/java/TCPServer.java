import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String args[]) {
        try {
            ServerSocket sock = new ServerSocket(4567);

            System.out.println("Waiting for Connection...\n");
            Socket soc = sock.accept();// waits until client is connected
            BufferedReader ser_is = new BufferedReader(new InputStreamReader(System.in));

            DataOutputStream outToclient = new DataOutputStream(soc.getOutputStream());
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            System.out.println("Connection Established\n");
            // Unicode Transformation Format (UTF)
            String msg1 = dis.readUTF();
            System.out.println("Client : " + msg1);
            System.out.print("Enter message : ");
            outToclient.writeUTF(ser_is.readLine());

            soc.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
