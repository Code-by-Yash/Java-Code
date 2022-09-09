import java.util.Scanner;
import java.util.Arrays;
public class lenthUsingInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        //Input
        for(int rows = 0; rows < a.length; rows++){
            for(int cols = 0; cols < a[rows].length; cols++){
                a[rows][cols] = input.nextInt();
            }
        }

        //Output
        // for(int rows = 0; rows < a.length; rows++){
        //     for(int cols = 0; cols < a[rows].length; cols++){
        //         System.out.print(a[rows][cols]+" ");
        //     }
        //     System.out.println();
        // }


        //or you can use this method to for output 
        // for(int rows = 0; rows < a.length; rows++){
        //     System.out.println(Arrays.toString(a[rows]));
        // }


        //or can us for each loop
        for(int[] b : a){
            System.out.println(Arrays.toString(b));
        }

    }
}