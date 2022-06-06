import java.io.*;
import java.net.*;
import java.lang.*;

class Server {
    public static void main(String args[]) {
        try {
            ServerSocket sock=new ServerSocket(4567);
            Socket soc=sock.accept();//waits until client is connected
            BufferedReader ser_is = new BufferedReader(new InputStreamReader(System.in));

            DataOutputStream outToclient =new DataOutputStream(soc.getOutputStream());

            DataInputStream dis=new DataInputStream(soc.getInputStream());
            System.out.println("Connection Established");
	//Unicode Transformation Format (UTF)	
            String msg1 =dis.readUTF();
            System.out.println("MESSAGE : "+msg1);
            outToclient.writeUTF(ser_is.readLine());

            soc.close();
        }
        catch(IOException e){
            System.out.println(e);

        }
    }
}
