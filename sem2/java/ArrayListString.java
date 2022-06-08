import java.util.*;

class ArrayListString {
        public static void main(String[] s) {
                // Declaring the ArrayList with
                ArrayList<String> st = new ArrayList<String>(5);

                // Appending at the end of the list
                for (int i = 1; i <= 5; i++)
                        st.add("Fruit " + i);

                // Printing elements
                System.out.println("st => " + st + "\n");
                // replace
                st.set(1, "Apple");
                System.out.println("st.set(1, \"Apple\") => " + st + "\n");
                // insert
                st.add(2, "Orange");
                System.out.println("st.add(2, \"Orange\") => " + st + "\n");
                // Remove element at index 3
                st.remove(4);
                System.out.println("st.remove(4) => " + st + "\n");
                System.out.println("st.size() => " + st.size() + "\n");

                // Displaying the ArrayList after deletion
                System.out.print("st (using get()) => ");
                // Printing elements one by one
                for (int i = 0; i < st.size(); i++)
                        System.out.print(st.get(i) + " ");
                // clear
                st.clear();
                System.out.println("\n\nst.clear() => " + st + "\n");
        }
}