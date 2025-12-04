/*Uppercase: JAVA PROGRAMMING
Lowercase: java programming */
import java.util.*;
public class StringCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = "Java Programming";//modify it to accept user input
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}