import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfObjects{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.next();
        }
        System.out.print(Arrays.toString(arr));
    }
}