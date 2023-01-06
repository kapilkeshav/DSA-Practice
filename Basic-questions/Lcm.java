//finding LCM using Euclidean Algorithm
import java.util.Scanner;
public class Lcm{
    static int gcd(int a, int b){
        if(a==0 || b==0){
            return a+b;
        }
        else{
            int bv = Math.max(a,b);
            int sv = Math.min(a,b);
            return gcd(bv%sv,sv);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Math.abs(scan.nextInt());
        System.out.print("Enter second number: ");
        int b = Math.abs(scan.nextInt());
        int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        System.out.printf("The lcm of %d and %d is %d.",a,b,lcm);
    }
}
