package base2;

/**
 *输出1-100之间的素数
 * @author Tina
 */
public class 素数 {
    public static void main(String[] args) {
        System.err.println("1-100之间的素数");
        for(int i = 1;i<=100;i++){
            if(isSU(i)!=-1)
                System.out.print(i+"  ");
        }
    }
    private static int isSU(int n){
        if(n == 1)return -1;
    for(int i=2;i<Math.sqrt(n);i++){
    if(n%i==0){
     return -1;
     }
    }
    return n;
    }
}
