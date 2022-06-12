import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String args[]) {
        try {
            Socket soc1 = new Socket("localhost", 4567);
            // or ipv4 address for different computers
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            DataOutputStream outToServer = new DataOutputStream(soc1.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(soc1.getInputStream()));
            System.out.print("Enter message : ");
            String msg = is.readLine();
            outToServer.writeUTF(msg + '\n');
            String reply = inFromServer.readLine();
            System.out.println("Server : " + reply);

            soc1.close();

        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
