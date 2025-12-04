/*OUTPUT:
ABC
ACB
BAC
BCA
CAB
CBA
*/
public class backtracking3 {

    public static void subStringtrace(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // pick one character
            char ch = str.charAt(i);

            // remaining string after removing ch
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            subStringtrace(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        subStringtrace(str, "");
    }
}
