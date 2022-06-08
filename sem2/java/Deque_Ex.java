import java.util.*; 
public class Deque_Ex { 
    public static void main(String[] args) { 
        //Declare Deque object 
        Deque<String> deque = new LinkedList<String>(); 
        // add elements to the queue using various methods 
        deque.add("Apple");           //add ()
        deque.addFirst("Fruit");      //addFirst ()
        deque.addLast("is");     //addLast ()
	System.out.println("Initial Deque:");
        System.out.print(deque + " "); 
        deque.push("A");         //push ()
        deque.offer("Good");        //offer ()
        deque.offerFirst("Daily");    //offerFirst ()
        deque.offerLast("for Health");   //offerLast ()
        System.out.println(" \nDeque:");
        System.out.print(deque + " "); 
      
       // Iterate using standard iterator
        System.out.println("\n\nDeque contents using Standard Iterator:"); 
        Iterator iterator = deque.iterator(); 
        while (iterator.hasNext()) 
            System.out.print(" " + iterator.next()); 
        
       // Iterate using Reverse order iterator 
        Iterator reverse = deque.descendingIterator(); 
        System.out.println("\n\nDeque contents using Reverse Iterator:"); 
        while (reverse.hasNext()) 
            System.out.print(" " + reverse.next()); 
          
        // Peek () method
        System.out.println("\n\nDeque Peek:" + deque.peek()); 
        System.out.println("\nDeque,After peek:" + deque); 
        
         // Pop () method 
        System.out.println("\nDeque Pop:" + deque.pop()); 
        System.out.println("\nDeque,After pop:" + deque); 
   
        // contains () method
        System.out.println("\nDeque Contains Three: " +  deque.contains("Three")); 
   
        deque.removeFirst();        //removeFirst () 
        deque.removeLast();         //removeLast ()
        System.out.println("\nDeque, after removing "  + "first and last elements: " + deque); 
   } 
}
