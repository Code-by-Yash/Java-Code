//Two functions can have same name if the paramaters are different;
public class function_overloading{
    public static void main(String[] args){
        func(25);
        func("Yash Sharma");
        //it is known by the function by the paramaters that which function is to be called;
    }

    static void func(int a ){
        System.out.println("First one");
        System.out.println(a);
    }

    static void func(String name){
        System.out.println("\nSecond one");
        System.out.println(name);
    } 
}