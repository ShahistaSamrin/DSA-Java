/* INPUT 
10,20
OUTPUT
Sum: 30
Min: 10
Max: 20
Average: 15.0
*/

import java.util.Scanner;

public class StoreAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        // Split numbers by comma
        String[] parts = line.split(",");

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String i : parts) {
            i = i.trim(); // remove extra spaces
            int num = Integer.parseInt(i);

            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = (double) sum / parts.length;

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);

        s.close();
    }
}
