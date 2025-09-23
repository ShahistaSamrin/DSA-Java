import java.util.*;

class PalindromeWithStringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        
        String str = sc.nextLine();
        str = str.trim(); // remove leading/trailing spaces
        
        // Use StringBuilder to reverse the string
        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        
        sc.close();
    }
}
