import java.util.Scanner;

public class RemoveE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all occurrences of 'e' or 'E'
        String result = str.replaceAll("e", ""); 

        System.out.println("String after removing 'e': " + result);
        sc.close();
    }
}
