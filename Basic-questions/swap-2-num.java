//Swapping 2 int numbers using the xor operation
import java.util.Scanner;
public class Main{
    static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.printf("Swapped numers are a:%d, b:%d%n",a,b);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = scan.nextInt();
        System.out.print("enter b: ");
        int b = scan.nextInt();
        swap(a,b);
    }
}
