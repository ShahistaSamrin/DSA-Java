/*OUTPUT:
20->3
10->3
30->2 */
import java.util.*;
public class SubArray1 {
    public static void main(String[] args) {
        int[] arr ={10,20,20,10,20,10,30,30};
        HashMap<Integer,Integer> data = new HashMap<>();
        for(int i: arr){
            data.put(i,data.getOrDefault(i, 0)+1);
        }
        for(int key : data.keySet()){
            System.out.println(key+"->"+data.get(key));
        }
    }
}
