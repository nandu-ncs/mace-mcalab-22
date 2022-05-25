import java.util.Scanner;
class Invalid extends Exception {
    Invalid (String s) {
        super(s);
    }
}
public class ExceptLogin {
    public static void main(String args[]) {
        String uname,pass;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username : ");
            uname = sc.nextLine();
            System.out.println("Enter password : ");
            pass = sc.nextLine();
            System.out.println();
            check(uname, pass);
        }
        catch (Invalid e) {
            System.out.println(e);
        }
    }
    static void check(String uname,String pass) throws Invalid {
        if(uname.equals("nandu") && pass.equals("123"))
            System.out.println("Login Success");
        else
            throw new Invalid("Incorrect login credentials!");
    }
}
