import java.util.Scanner;
public class SwapChars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()>1){
            String swapped = str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
            System.out.println("Swapped: " + swapped);
        }else{
            System.out.println(str);
        }
    }
}
