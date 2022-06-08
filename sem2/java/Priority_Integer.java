import java.util.*;
 
class Priority_Integer{  
    public static void main(String args[]){ 
        //declare a PriorityQueue object with default ordering
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        //add element to the PriorityQueue
        pq.add(8);  
        pq.add(6);  
        pq.add(4); 
        pq.add(2);  
        pq.add(12);  
        pq.add(10);
        //display the min PriorityQueue
        System.out.println("The min Priority Queue (natural ordering) contents:");
        Integer val = null;
        while( (val = pq.poll()) != null) {
            System.out.print(val + " ");
        }
    }  
}