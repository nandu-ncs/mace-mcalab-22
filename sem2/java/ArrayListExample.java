import java.util.*;

class ArrayListExample {
    public static void main(String[] a) {

        int n = 5, num;

        // Declaring the ArrayList with

        ArrayList<Integer> ar_list = new ArrayList<Integer>(n);

        // Appending at the end of the list
        for (int i = 0; i < n; i++)
            // num=Integer.parseInt(a[i]);
            ar_list.add(i * i + 5);

        // Printing elements
        System.out.println(ar_list);

        // Remove element at index 3
        ar_list.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println(ar_list);

        // Printing elements one by one
        for (int i = 0; i < ar_list.size(); i++)
            System.out.print(ar_list.get(i) + " ");
    }
}