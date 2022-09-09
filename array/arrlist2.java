import java.util.Scanner;
import java.util.ArrayList;
public class arrlist2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        //Take Input
        for(int i=0;i<9;i++){
            a.add(in.nextInt());
        }
        for(int i=0;i<9;i++){
            System.out.println(a.get(i));
        }
        System.out.println(a);
    }
}