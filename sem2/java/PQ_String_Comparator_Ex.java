import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_String_Comparator_Ex {
  public static void main(String[] args) {

// A custom comparator that compares two Strings by their length.

    Comparator<String> str_Length = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    };

    /*
    The above Comparator can also be created using lambda expression like this =>
    Comparator<String> stringLengthComparator = (s1, s2) -> {
    return s1.length() - s2.length();
    };

    Which can be shortened even further like this =>
    Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
    */

    // Create a Priority Queue with a custom Comparator
    PriorityQueue<String> ob_pq = new PriorityQueue<String>(str_Length);

    // Add items to a Priority Queue (ENQUEUE)
    ob_pq.add("Lisa");
    ob_pq.add("Robert");
    ob_pq.add("John");
    ob_pq.add("Chris");
    ob_pq.add("Angelina");
    ob_pq.add("Joe");

// Remove items from the Priority Queue 
    while (!ob_pq.isEmpty()) {
      System.out.println(ob_pq.remove());
    }
  }
}