import java.io.*;
import java.lang.*;
import java.util.*;
 

class Student {
 
    // Attributes of a student
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name, String address)
    {
 
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    //To  print any object, Java compiler internally invokes the toString() method on the object

    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
 

     //Comparator interface
class Sortbyroll implements Comparator<Student> {
 
   
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}
 
class Sortbyname implements Comparator<Student> {
 
    
    // Sorting in ascending order of name

    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
    }
}
 

class Priority_Q_Ex {
 
    //  driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();
 
        // Adding entries in above List using add() method
        ar.add(new Student(111, "Maya", "Kerala"));
        ar.add(new Student(131, "Anna", "Delhi"));
        ar.add(new Student(121, "Solmon", "Vishakappatanam"));
        ar.add(new Student(101, "Hari", "MadhayaPradesh"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());
 
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());
 
        // Display message on console for better readability
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}