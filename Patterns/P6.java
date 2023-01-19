/*
Pattern-6
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
       *
       *
       *
       *
       *
       *
    *******
 */
public class P6{
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = 1;l<=n-2;l++){
            for(int i = 1;i<=(n-1);i++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 4;i<=n-1;i++){
            System.out.print(" ");
        }
        for(int j = 1;j<=((2*4)-1);j++){
            System.out.print("*");
        }
    }
}
