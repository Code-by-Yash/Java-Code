public class scope{
    public static void main(String[] args){
        int a = 20;
        int b = 40;
        {
            //Block Scope:-
           // int a = 80; you can't declare the same variable again
           a=45; //can change the vlaue
           int c = 90; // c is only used in this block;
        }
        // System.out.println(c);
        System.out.println(a);
   }
}