import java.util.*;

public class HashSetCompare {
  public static void main(String[] args) {
    // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
    // use add() method to add values in the hash set
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    System.out.println("h_set = " + h_set);

    HashSet<String> h_set1 = new HashSet<String>();
    h_set1.add("Red");
    h_set1.add("Pink");
    h_set1.add("Orange");
    h_set1.add("Black");
    System.out.println("h_set1 = " + h_set1);

    HashSet<String> h_set2 = new HashSet<String>();
    h_set2.add("Pink");
    h_set2.add("Red");
    h_set2.add("Black");
    h_set2.add("Orange");
    System.out.println("h_set2 = " + h_set2);
    System.out.println();
    System.out.println("After comparing h_set1 and h_set2 = " + h_set1.equals(h_set2));
    System.out.println("After comparing h_set and h_set2 = " + h_set.equals(h_set2));
  }
}