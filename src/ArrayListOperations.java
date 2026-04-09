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

        // Sort items alphabetically
        Collections.sort(list);

        // Search item
        String searchItem = sc.next();
        boolean found = list.contains(searchItem);

        // Output
        System.out.println("Sorted Items: " + list);
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
