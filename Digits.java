/*OUTPUT:
Enter a number: 13
Sum of digits = 4
Product of digits = 3
Count of digits = 2 */
import java.util.Scanner;

class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, product = 1, count = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;   // get last digit
            sum = sum + digit;
            product = product * digit;
            count = count + 1;

            temp = temp / 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);
        System.out.println("Count of digits = " + count);
    }
}
