import java.io.*;
class File_Read {
	public static void main(String arg[]) throws IOException {
		String s="";

		try{
			FileReader f1=new FileReader("files/test1.txt");

//Reader and  Writer are used in character streams and End of file (null)

			BufferedReader r=new BufferedReader(f1);
			while((s=r.readLine())!=null) {
				System.out.println(s);
			}
			r.close();

		}catch(IOException e){System.out.println(e);}

	}
}
