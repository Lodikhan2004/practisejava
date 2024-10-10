import java.util.*;
public class array {

    public static void main(String[] args) {
        System.out.println("enter size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int numbers[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                System.out.println("ARRAY IS NOT SORTED ");
                return;
            }
        }
        System.out.println("array is  sorted"); 

       
}
}