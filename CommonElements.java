/*OUTPUT:
Common Elements: 3 5  */
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {4, 3, 2, 1, 5};
        int[] arr2 = {6, 7, 9, 3, 5};

        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr1
        for (int n : arr1) {
            set.add(n);
        }

        System.out.print("Common Elements: ");

        // Check arr2 elements inside set
        for (int n : arr2) {
            if (set.contains(n)) {
                System.out.print(n + " ");
            }
        }
    }
}