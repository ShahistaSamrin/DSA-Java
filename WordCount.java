/*OUTPUT:
java=3
code=2 */
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "java JAVA Java Code code";
        str = str.toLowerCase();
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        
        }
        for(String key : map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
}
