/*OUTPUT:
/Pair Found: 7 + 3 = 10 */
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
        int[] arr = {2, 7, 11, 15, 5, 3};
        int target = 10;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int temp = target - arr[i];

            // If complement already exists in map → pair found
            if (map.containsKey(temp)) {
                System.out.println("Pair Found: " + temp + " + " + arr[i] + " = " + target);
                return; // stop after first pair found
            } 

            // Else store current value with its index
            map.put(arr[i], i);
        }
    }
        
}

