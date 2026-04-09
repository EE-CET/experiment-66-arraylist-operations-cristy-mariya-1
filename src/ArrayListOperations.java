import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        // Read items
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // Sort alphabetically
        Collections.sort(list);

        // Read search item
        String searchItem = sc.next();

        // Print sorted list
        System.out.println("Sorted Items: " + list);

        // Check existence
        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
