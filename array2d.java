import java.util.*;
public class array2d {
    public static void main(String[] args) {
        
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the matrix:");
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched:");
        int num=sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
               if(matrix[i][j]==num){
                System.out.println("Number found at index :"+ "("+ i +","+j+")");
                return;
               }
            }
        }
        System.out.println("num not found");

        
       

    }
    
}
