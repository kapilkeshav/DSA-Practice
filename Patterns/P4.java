/*
Pattern-4
     *
    **
   ***
  ****
 *****
******
 */
public class P4{
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
