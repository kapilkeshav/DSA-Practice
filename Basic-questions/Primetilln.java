//Sieve of Eratosthenes
import java.util.Scanner;
import java.util.Arrays;

public class Primetilln{
    static void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j = i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
        
    }
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scan.nextInt();
        sieve(n);
    }
}
