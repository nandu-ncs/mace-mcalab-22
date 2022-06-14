import java.util.*;

class HashMapMain {

    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<String, Integer>();

        // Add some courses.
        courses.put("Java Courses", 6);
        courses.put("Cloud Courses", 7);
        courses.put("Programming Courses", 5);
        courses.put("Data Science Courses", 2);

        System.out.println("Total courses: " + courses.size() + "\n");

        Set<Map.Entry<String, Integer>> st = courses.entrySet();

        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        String searchKey = "Java Courses";
        if (courses.containsKey(searchKey))
            System.out.println("Found total " + courses.get(searchKey) + " " + searchKey);

        courses.put("Data Science Courses", 4);
        System.out.println("\nAfter changing element : " + courses);

        courses.remove("Cloud Courses");
        System.out.println("After removing element : " + courses);

    }
}