import java.util.*;
class PalindromeString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        
        String str=sc.nextLine();
        str=str.trim();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        
        }
        if(str.equals(rev))
            System.out.println("it is a palindrome");
            else
            System.out.println("it is not palindrome");

    }
}