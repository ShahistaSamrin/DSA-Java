/*OUTPUT:
 Enter a string:shahista
Reversed words:atsihahs */
import java.util.Scanner;

public class CountWordsReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        str = str.trim();
        String[] words = str.split("\\s+");
        String reversedString = "";
        for(String word : words){
            String reversedWord = "";
            for(int i=word.length() - 1;i>=0;i--){
                reversedWord += word.charAt(i);
            }
            reversedString += reversedWord + " ";
        }
        System.out.println("Reversed words:"+ reversedString.trim());
        sc.close();


    }
}