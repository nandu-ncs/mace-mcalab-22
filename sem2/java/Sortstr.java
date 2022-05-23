import java.util.*;
import java.text.Collator;
class Sortstr {
	int n;
	String str[];
	public void sort_string() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of strings : ");
		this.n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		String str[] = new String[n];
		for(i=0;i<n;++i)
			str[i] = sc.nextLine();
		Arrays.sort(str,Collator.getInstance());
		System.out.println();
		for(i=0;i<n;++i)  
			System.out.println(str[i]);
	}

	public static void main(String[] args) {
		Sortstr data = new Sortstr();
		data.sort_string();
	}

}