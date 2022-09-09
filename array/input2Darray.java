import java.util.Scanner;
public class input2Darray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][7];

        //take input
        for(int rows = 0; rows < 3 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){
                System.out.print("Enter ["+rows+","+cols+"] element of array: ");
                arr[rows][cols] = input.nextInt();
            }
        }
        //give output
        for(int rows = 0; rows < 4 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){
                System.out.print(arr[rows][cols]+"\t");
            }
            System.out.println();
        }
    }
}