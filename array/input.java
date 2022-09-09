import java.util.Arrays;
import java.util.Scanner;
public class input{
    public static void main(String[] args){
        int[] arr = new int[5];
        //Array of primitives
        // arr[0] = 67;
        // arr[1] = 43;
        // arr[2] = 34;
        // arr[3] = 4;
        // arr[4] = 2;
        // //[67, 43, 34, 4, 2]
        // System.out.println(arr[3]);

        //Now we take the input using for loop
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        //loop for printing the array
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(i+"th element of array is  "+arr[i]);
        //}

        //We can also can use for each loop here
        // for(int num : arr){//for every element in array print the element
        //     System.out.print(num+" ");//num represents the element of the array
        // }

        // or we can use array class which is "Arrays.tostring"
        System.out.print(Arrays.toString(arr));
    }
}