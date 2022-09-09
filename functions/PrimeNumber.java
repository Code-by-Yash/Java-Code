import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        FuncPrimeNum(number);    
    }

    static void FuncPrimeNum(int number){
        int c=2;
        if(c > number){
            while(c > number){
            if(number % c == 0){
                System.out.print("Not Prime");
                break;
            }
            c++;
        }
        }
        else{
            System.out.print("Prime");
        }

    }
}