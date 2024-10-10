import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE");
        int size=sc.nextInt();
        sc.nextLine();
        String name[]=new String[size];
        System.out.println("ENTER THE NAMES");
        for(int i=0;i<size;i++){
            name[i]=sc.nextLine();
        }
        System.out.println("THE ENTERED NAMES :");
        for(int i=0;i<size;i++){
          System.out.println(name[i]);
        }

        System.out.println("THE ENTERED NAMES ARE:");
        for(int i=0;i<size;i++){
          System.out.println(name[i]);
        }
        System.out.println("afzal");
        System.out.println("fuzail");
       

    }
}
