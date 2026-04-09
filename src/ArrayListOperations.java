import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        Collections.sort(list);

        String searchItem = sc.next();

        System.out.println("Sorted Items: " + list);

        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
