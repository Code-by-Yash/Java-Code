import java.util.Scanner;

public class func1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String message = greeting(name);
        System.out.println(message);
    }

static String greeting(String name){
    String msg = "Hello "+name;
    return msg;
}

static int sum3(int a,int b){
    int sum = a + b;
    return sum;
}


static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = input.nextInt();
        System.out.print("Enter number 2:");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is = "+ sum);
}


static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = input.nextInt();
        System.out.print("Enter number 2:");
        int b = input.nextInt();
        int sum = a + b;
        return sum;
}
}