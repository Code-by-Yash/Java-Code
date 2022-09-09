import java.util.Scanner;
public class maxItem{
    public static void main(String[] args){
        int[] arr = new int[6];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the starting index: ");
        int a = in.nextInt();
        System.out.print("Enter the ending index: ");
        int b = in.nextInt();
        int maxVal = maxInRange(arr,a,b);
        System.out.print(maxVal);
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0; i<arr.length; i++){
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }


    static int maxInRange(int[] arr,int start,int end){
        int maxVal = arr[start];
        for(int i = start; i<=end; i++){
            if(maxVal<arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}