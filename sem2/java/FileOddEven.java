import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOddEven {
	public static void main(String args[]) {
		String s = "";
		int v;
		BufferedReader br = null;
		try {

			BufferedWriter wro = new BufferedWriter(new FileWriter("files/odd.txt"));
			BufferedWriter wre = new BufferedWriter(new FileWriter("files/even.txt"));
			br = new BufferedReader(new FileReader("files/nums.txt"));
			while ((s = br.readLine()) != null) {
				v = Integer.parseInt(s);
				if (v % 2 == 0)
					wre.append(Integer.toString(v) + "\n");
				else
					wro.append(Integer.toString(v) + "\n");
			}
			wro.close();
			wre.close();

			BufferedReader ro = new BufferedReader(new FileReader("files/odd.txt"));
			BufferedReader re = new BufferedReader(new FileReader("files/even.txt"));
			System.out.println("\nodd.txt : ");
			while ((s = ro.readLine()) != null) {
				System.out.println(s);
			}
			System.out.println("\n\neven.txt : ");
			while ((s = re.readLine()) != null) {
				System.out.println(s);
			}
			ro.close();
			re.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}