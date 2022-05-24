import java.util.Scanner;
class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee number : ");
		eNo = Integer.parseInt(sc.nextLine());
		System.out.print("Enter employee name : ");
		eName = sc.nextLine();
		System.out.print("Enter salary : ");
		eSalary = sc.nextInt();
		System.out.println();
	}
	public void display() {
		System.out.println();
		System.out.println("Employee No : "+eNo);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Salary : "+eSalary);
	} 
	public static void main(String args[]) {
		int i,n,sno,f = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of employees : ");
		n = sc.nextInt();
		System.out.println();
		Employee emp[] = new Employee[n];
		for(i=0;i<n;i++) {
			emp[i] = new Employee();
		}
		System.out.print("Enter employee number to search : ");
		sno = sc.nextInt();
		for(i=0;i<n;i++) {
			if(emp[i].eNo == sno)
				f = i;
		}
		if(f == -1)
			System.out.println("Employee not found!");
		else
			emp[f].display();
	}
}