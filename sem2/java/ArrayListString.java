import java.io.*; 
import java.util.*; 

class ArrayListString { 
    public static void main(String[] s) { 

        int n = 5;

// Declaring the ArrayList with 

        ArrayList<String> st= new ArrayList<String>(n); 

// Appending at the end of the list 
        for (int i = 1; i <= n; i++) 
            st.add("Fruit "+ i ); 

// Printing elements 
        System.out.println(st); 
        st.set( 1,"Apple");// replace
        st.add( 2,"Orange");// insert
        System.out.println(st); 
        // Remove element at index 3 
        st.remove(4); 

        // Displaying the ArrayList after deletion 
        System.out.println(st); 

        // Printing elements one by one 
        for (int i = 0; i < st.size(); i++) 
            System.out.print(st.get(i) + " "); 
    } 
} 