import java.util.Scanner;

public class CountCharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Input target character
        System.out.print("Enter a character to count: ");
        char target = sc.next().charAt(0);  // read first character

        int count = 0;

        // Count frequency
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }

        System.out.println("Frequency of '" + target + "': " + count);

        sc.close();
    }
}
