//Reverse a string using recursion
import java.util.Scanner;
public class Revstr {
    static void revstr(String a,int len){
        if(a.isEmpty()) {
            System.out.println("String is empty");
        }
        if(len>=0){
            System.out.print(a.charAt(len));
            revstr(a,len-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string to be reversed: ");
        String a = scan.nextLine();
        int len = a.length();
        revstr(a,len-1);
    }
}
