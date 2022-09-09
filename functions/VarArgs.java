//#Variable Arguments:-
//these are used when we don't know the number of aruguments;
import java.util.Arrays;
public class VarArgs{
    public static void main(String[] args){
        multiple(1,22,"Yash","Tanish");
    }

    static void multiple(int a,int b,String ...c){
        System.out.print(Arrays.toString(a));
        System.out.print(Arrays.toString(c));
    }

    static void fun(int ...v){//it will take the array of Integers
    //(String ...var) for array of string
    //(char ...var) for array fo character
        System.out.println(Arrays.toString(v));
    }
}