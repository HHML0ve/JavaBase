package base2;

/**
 * ¥Ú”°°Û
 * @author Administrator
 */
public class ¥Ú”°¡‚–Œ {
    public static void main(String[] args) {
        int k = 5;
    for(int i = 1;i<=k;i++){
        for(int t = k;t>i;t--){
        System.out.print(" ");
        }
    for(int m = 1;m<=2*i-1;m++){
        System.out.print("*");
        }
    System.out.println();
      }
    for(int i = k-1;i>=1;i--){
       for(int t = k-i;t>=1;t--){
       System.out.print(' ');
       }
    for(int m = 2*i-1;m>=1;m--){
        System.out.print("*");
        }
    System.out.println();
      }
    
    }
}
