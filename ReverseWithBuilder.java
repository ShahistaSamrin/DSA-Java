

public class ReverseWithBuilder {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reversed : " + sb.reverse());
        
    }
}
