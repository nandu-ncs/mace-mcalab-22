import java.util.Scanner;

class Person {
    Scanner myObj = new Scanner(System.in);
    String name, gender, address;
    int age;

    Person() {
        System.out.print("Enter name : ");
        name = myObj.nextLine();
        System.out.print("Enter gender : ");
        gender = myObj.nextLine();
        System.out.print("Enter address : ");
        address = myObj.nextLine();
        System.out.print("Enter age : ");
        age = myObj.nextInt();
        myObj.nextLine();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }
}

class Employee extends Person {
    int empid;
    String cname, qualification;
    double salary;

    Employee() {
        super();
        System.out.print("Enter company name : ");
        cname = myObj.nextLine();
        System.out.print("Enter qualification : ");
        qualification = myObj.nextLine();
        System.out.print("Enter salary  : ");
        salary = myObj.nextDouble();
        myObj.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Company Name : " + cname);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary  : " + salary);
    }
}

class Teacher extends Employee {
    int teacherid;
    String subject, dept;

    Teacher() {
        super();
        System.out.print("Enter teacher id : ");
        teacherid = myObj.nextInt();
        myObj.nextLine();
        System.out.print("Enter subject : ");
        subject = myObj.nextLine();
        System.out.print("Enter department : ");
        dept = myObj.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Teacher Id : " + teacherid);
        System.out.println("Subject : " + subject);
        System.out.println("Department : " + dept);
    }
}

class MainInherit {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of teachers : ");
        n = sc.nextInt();
        System.out.println();
        Teacher t[] = new Teacher[n];
        for (i = 0; i < n; i++) {
            System.out.println("\nEnter details of teacher " + (i + 1));
            t[i] = new Teacher();
        }
        System.out.println("\nTeacher Details");
        for (i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1));
            t[i].display();
        }
    }
}