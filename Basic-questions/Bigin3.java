//finding greatest of 3 numbers.
import java.util.Scanner;
public class Bigin3{
    static void great3(int a, int b, int c){
        if(a>b && a>c){
            System.out.printf("a:%d is the greatest.",a);
        }
        else if(b>c && b>a){
            System.out.printf("b:%d is the greatest.",b);
        }
        else{
            System.out.printf("c:%d is the greatest.",c);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan. nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();
        great3(a,b,c);
    }
}
