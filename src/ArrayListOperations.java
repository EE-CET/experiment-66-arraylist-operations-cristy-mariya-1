import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] items = scanner.nextLine().trim().split(" ");
        String searchItem = scanner.nextLine().trim();

        ArrayList<String> cart = new ArrayList<>(Arrays.asList(items));
        Collections.sort(cart);

        System.out.println("Sorted Items: " + cart);
        System.out.println(cart.contains(searchItem) ? "Found" : "Not Found");
    }
}
