import java.util.Arrays;
public class SwapElement{
    public static void main(String[] args){
        int[] arr = {1, 23, 55, 66, 88};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr){
        int j=arr.length-1;
        int temp;
        for(int i=0;i<(arr.length/2);i++){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        return arr;
    }

    static void swap(int[] arr,int Index1,int Index2){
        int temp = arr[Index1];
        arr[Index1] = arr[Index2];
        arr[Index2] = temp;
    }
}