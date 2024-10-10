import java.util.*;
public class function1 {
    public static int factorial(int n){
        if(n<0){
            System.out.println("INVALID");
            return -1;
        }
        if(n==0){
            return 1;
        }
      int fact=1;
      for(int i=n; i>=1; i--){
        fact = fact * i;
      }
      return fact;
      
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int res=factorial(n);
        if(res!=-1)
           System.out.println("FACTORIAL OF " + n + " IS " + res );
        
    
}
}
