import java.util.*;
import graphics.*;
public class  PackageArea {
	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in);
		GraphicsShapes sh = new GraphicsShapes();
		int l,b,h,s,r,c;
		while(true) {
			System.out.println("\n\n1.Rectangle");
			System.out.println("2.Triangle");
			System.out.println("3.Square");
			System.out.println("4.Circle");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
			c = Integer.parseInt(sc.nextLine());
			switch(c) {
				case 1:
				System.out.print("Enter  length : ");
				l = Integer.parseInt(sc.nextLine());
				System.out.print("Enter  breadth : ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("Area : "+sh.rarea(l,b));
				break;
				case 2:
				System.out.print("Enter  base : ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter  height : ");
				h = Integer.parseInt(sc.nextLine());
				System.out.println("Area : "+sh.tarea(b,h));
				break;
				case 3:
				System.out.print("Enter  side : ");
				s = Integer.parseInt(sc.nextLine());
				System.out.println("Area : "+sh.sarea(s));
				break;
				case 4:
				System.out.print("Enter  radius : ");
				r = Integer.parseInt(sc.nextLine());
				System.out.println("Area : "+sh.carea(r));
				break;
				case 5:
				System.out.println("Exiting the Program...");
				System.exit(0);
				default:
				System.out.print("Invalid choice!");
			}
		}
	}
}