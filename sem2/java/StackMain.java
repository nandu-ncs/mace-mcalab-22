import java.util.*;

public class StackMain {
	public static void main(String args[]) {
		int ch, x;
		Stack<Integer> stk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n\n1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("4:Size");
			System.out.println("5:Exit");
			System.out.print("Enter your choice : ");
			ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
				case 1:
					System.out.print("Enter element to insert : ");
					x = Integer.parseInt(sc.nextLine());
					stk.push(x);
					System.out.println("Stack elements : " + stk);
					break;
				case 2:
					if (stk.isEmpty())
						System.out.println("Stack is empty!");
					else {
						x = stk.pop();
						System.out.print("Element poped : " + x);
					}
					break;
				case 3:
					if (stk.isEmpty())
						System.out.println("Stack is empty!");
					else {
						System.out.println("Stack elements : " + stk);
					}
					break;
				case 4:
					System.out.println("No: of elements in stack : " + stk.size());
					break;
				case 5:
					System.out.println("Exiting from program...");
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}