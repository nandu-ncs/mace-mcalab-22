import java.io.*;

class FileWriteRead {
	public static void main(String args[]) {
		try {
			String str, txt = "";
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);

			System.out.println("Enter the string : ");
			while ((str = br.readLine()) != null) {
				txt = txt + str + "\n";
			}

			FileWriter f = new FileWriter("files/test1.txt");
			BufferedWriter wr = new BufferedWriter(f);
			wr.write(txt);
			wr.close();
			System.out.println("\nSucessfully written to the file");

			FileReader f2 = new FileReader("files/test1.txt");
			BufferedReader br2 = new BufferedReader(f2);
			System.out.println("\ntest1.txt : \n");
			while ((str = br2.readLine()) != null) {
				System.out.println(str);
			}
			br2.close();
		} catch (IOException w) {
			System.out.println(w);
		}
	}
}