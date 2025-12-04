/*OUTPUT:
abc
ab
ac
a
bc
b
c
 */
public class backtracking4 {
    public static void findSubStrings(String str,int index,String curr){
    if(index==str.length()){
        System.out.println(curr);
        return;
    }
    findSubStrings(str, index+1,curr+str.charAt(index));
    findSubStrings(str, index+1,curr);
}
public static void main(String[] args) {
    String str = "abc";
    findSubStrings(str, 0, "");
}
}
