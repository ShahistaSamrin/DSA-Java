import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all white spaces
        String result = str.replaceAll("\\s+", ""); // \s matches any whitespace character

        System.out.println("String without spaces: " + result);
        sc.close();
    }
}
