/*OUTPUT:
Duplicates are present */
import java.util.*;

public class Duplicateornot {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};

        HashSet<Integer> set = new HashSet<>();
        boolean duplicateFound = false;

        for (int num : arr) {
            if (set.contains(num)) {
                duplicateFound = true;
                break;
            } else {
                set.add(num);
            }
        }

        if (duplicateFound) {
            System.out.println("Duplicates are present");
        } else {
            System.out.println("No duplicates in the array");
        }
    }
}
