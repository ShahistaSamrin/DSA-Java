/*OUTPUT:
false    */
public class Array1{
    public static void main(String[] args){
        int[] arr={0,4,2,0,6,9,7,5,3,4,8};
        int target = 10;
        System.out.println(value(arr,target));

    }
    public static boolean value(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
}