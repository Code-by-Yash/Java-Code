import java.util.Scanner;
import java.util.ArrayList;
public class MultiArrayList{
    public static void main(String[] args){
        //here we have to create array list of array list of Integer type
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initilisation
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>()); 
        }

        // add elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.print(list);
    }
}