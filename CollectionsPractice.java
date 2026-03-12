import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Swapnil");
        students.add("Amit");
        students.add("Priya");
        students.add("Swapnil");

        System.out.println("ArrayList - Students:");
        System.out.println(students);

        System.out.println("Student at index 2: " + students.get(2));

        LinkedList<String> songs = new LinkedList<>();

        songs.add("Shape of You");
        songs.add("Believer");
        songs.add("Perfect");
        songs.add("Levitating");

        System.out.println("\nLinkedList - Songs Playlist:");
        System.out.println(songs);

        HashSet<String> usernames = new HashSet<>();

        usernames.add("swapnil123");
        usernames.add("rahul45");
        usernames.add("amit_dev");
        usernames.add("swapnil123");

        System.out.println("\nHashSet - Usernames:");
        System.out.println(usernames);

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "John");
        employees.put(102, "Emma");
        employees.put(103, "David");
        employees.put(104, "Sophia");

        System.out.println("\nHashMap - Employees:");
        System.out.println(employees);

        System.out.println("Employee with ID 102: " + employees.get(102));
    }
}