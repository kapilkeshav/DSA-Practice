//Fibonacci series of n digits
import java.util.Scanner;
public class Fibtilln{
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2;i<n;i++){
            int sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonacci(n);
    }
}
