import java.util.Scanner;
public class MainComplex {
	int real;
	int imaginary;
	public MainComplex(int real_get,int imag_get){
		this.real = real_get;
		this.imaginary = imag_get;
	}
	public static MainComplex sum(MainComplex c1,MainComplex c2){
		MainComplex res = new MainComplex(0,0);
		res.real = c1.real + c2.real;
		res.imaginary = c1.imaginary + c2.imaginary;
		return res;
	}
	public static void main(String []args){
		int a,b,c,d;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter real & imaginary of first number : ");
		a=myObj.nextInt(); 
		b=myObj.nextInt(); 
		MainComplex first = new MainComplex(a,b);
		System.out.println("Enter real & imaginary of second number : ");
		c=myObj.nextInt(); 
		d=myObj.nextInt(); 
		MainComplex second = new MainComplex(c,d);
		MainComplex res = sum(first,second);
		System.out.println("Sum is : " + res.real + "+" +res.imaginary + "i");
	}
}