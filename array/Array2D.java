import java.util.Arrays;
public class Array2D{
    public static void main(String[] args){
        int[][] arr2D = {
                        {1,2},
                        {3,4},
                        {6,7},
        }; 
        //Output the 2D array
        for(int rows = 0 ; rows < 3 ; rows++){
            //here we take input for each row
            //every row is itself an array of size 2
            for(int cols = 0 ; cols < 2 ; cols++){
                System.out.print(arr2D[rows][cols]+"  ");
            }
            System.out.println();
        }
        int[][] arr = new int[3][];
        
    }
}


