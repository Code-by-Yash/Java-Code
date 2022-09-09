import java.util.Scanner;
public class addMatrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[50][50];
        int[][] arr2 = new int[50][50];
        int[][] sum = new int[50][50];
        //take input
        for(int rows = 0; rows < 3 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){
                System.out.print("Enter ["+rows+","+cols+"] element of first array: ");
                arr[rows][cols] = input.nextInt();
            }
        }

        for(int rows = 0; rows < 3 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){
                System.out.print("Enter ["+rows+","+cols+"] element of second array: ");
                arr2[rows][cols] = input.nextInt();
            }
        }

        //add the two arrays;
        for(int rows = 0; rows < 3 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){
                sum[rows][cols] = arr[rows][cols] + arr2[rows][cols];
            }
        }

        //give output
        for(int rows = 0; rows < 3 ; rows++){
            for(int cols = 0; cols < 6 ; cols++){2
                System.out.print(sum[rows][cols]+"\t");
            }
            System.out.println();
        }
    }
}