//Adding 2 binary strings
import java.util.Scanner;
public class Addbstr{
    static String conv(String a, String b){
        int c = Integer.parseInt(a,2);
        int d = Integer.parseInt(b,2);

        int res = c+d;
        String result = Integer.toBinaryString(res);
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Binary String: ");
        String a = scan.nextLine();
        System.out.print("Enter First Binary String: ");
        String b = scan.nextLine();
        System.out.println(conv(a,b));
    }
}
