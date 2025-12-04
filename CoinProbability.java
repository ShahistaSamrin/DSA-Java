/*OUTPUT:
000
100
010
110
001
101
011
111

Total Heads: 12
Total Tails: 12

Probability of Heads: 0.5
Probability of Tails: 0.5 */
public class CoinProbability {

    public static void main(String[] args) {

        int totalTosses = 3;
        int totalOutcomes = (int) Math.pow(2, totalTosses);  // 2^3 = 8

        int headCount = 0;
        int tailCount = 0;

        // Generate all possible outcomes
        for (int i = 0; i < totalOutcomes; i++) {
            String outcome = "";
            int temp = i;

            for (int j = 0; j < totalTosses; j++) {
                if (temp % 2 == 0) {
                    outcome += "0";   // Head
                    headCount++;
                } else {
                    outcome += "1";   // Tail
                    tailCount++;
                }
                temp /= 2;
            }

            System.out.println(outcome);
        }

        System.out.println("\nTotal Heads: " + headCount);
        System.out.println("Total Tails: " + tailCount);

        double headProbability = (double) headCount / (totalOutcomes * totalTosses);
        double tailProbability = (double) tailCount / (totalOutcomes * totalTosses);

        System.out.println("\nProbability of Heads: " + headProbability);
        System.out.println("Probability of Tails: " + tailProbability);
    }
}
