import java.util.Scanner;
class Matrix {
	int m,n,i,j;
	int[][] a = new int[5][5];
	int[][] b = new int[5][5];
	int[][] c = new int[5][5];
	Scanner myObj = new Scanner(System.in); 
	void get() {
		System.out.println("Enter no: of rows : ");
		m = myObj.nextInt(); 
		System.out.println("Enter no: of column : ");
		n = myObj.nextInt();
		System.out.println("Enter elements of matrix A : ");
		for(i=0;i<m;i++) 
			for(j=0;j<n;j++)
				a[i][j]=myObj.nextInt(); 
		System.out.println("Enter elements of matrix B : ");
		for(i=0;i<m;i++) 
			for(j=0;j<n;j++)
				b[i][j]=myObj.nextInt();
	}
	void add() {
		for(i=0;i<m;i++) 
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
	}
	void display() {
		System.out.println("Matrix A : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
		System.out.println("Matrix B : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++)
				System.out.print(b[i][j]+"  ");
			System.out.println();
		}
		System.out.println("Matrix C : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++)
				System.out.print(c[i][j]+"  ");
			System.out.println();
		}
	}
}
public class MainMatrix {
	public static void main(String[] args) {
		Matrix ob = new Matrix();
		ob.get();
		ob.add();
		ob.display();
	}
} 