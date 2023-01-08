//Leap year or not
import java.util.Scanner;
public class Leapyear{
    static void leap(int year){
        if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else if(year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        leap(year);
    }
}
