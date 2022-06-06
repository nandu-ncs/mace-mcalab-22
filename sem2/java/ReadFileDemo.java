import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
		String s=""; 
		int v;

		BufferedReader br = null;

		try {	
			br = new BufferedReader(new FileReader("files/nums.txt"));		
			while((s=br.readLine())!=null) {
				v=Integer.parseInt(s);
				if (v%2==0)
					System.out.println("Even = "+v);
				else
					System.out.println("Odd  = "+v);
			}
		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		} 
	}
}