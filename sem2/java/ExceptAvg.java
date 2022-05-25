import java.util.*;

class MyException extends Exception {
    public MyException(String value) {
        super(value);
    }
}

class ExceptAvg {
    public static void main(String args[]) {
        int totalNums;
        int i;
        int temp, count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Total numbers : ");
        totalNums = Integer.parseInt(sc.nextLine());
        for (i = 0; i < totalNums; i++) {
            try {
                temp = Integer.parseInt(sc.nextLine());
                if (temp > 0) {
                    sum += temp;
                    count += 1;
                } else {
                    throw new MyException(Integer.toString(temp));
                }
            } catch (MyException ex) {
                System.out.print(ex.getMessage());
                System.out.println(" - is a negative number");
            }
        }
        System.out.println("Count : " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average : " + ((float)sum / count));

    }
}