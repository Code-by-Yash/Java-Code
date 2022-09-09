public class shadowing{
    static int a = 10;//This will be shadowed.
    public static void main(String[] args){
        System.out.println(a);
        int a = 15;//this 'a' is accessed only in this block 
        System.out.println(a);
        fun();
    }

    static void  fun(){
        System.out.println(a);// a = 10 will be printed 
    }
}
// Note:

//int x;
//x=45; from here the scope will begin 
//so scope will begin when value will be intialized;