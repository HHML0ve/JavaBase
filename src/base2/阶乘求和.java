/*
 * and open the template in the editor.
 */
package base2;

import java.util.Scanner;

/**
 * 求阶乘和：3！ = 3*2*1+2*1+1
 * @author Administrator
 */
public class 阶乘求和 {
    private static double getI(int i){
    if(i == 1)
        return 1;
    else return getI(i-1)*i;
    }
    
    public static void main(String[] args){
        double sum = 0;
        int n = new Scanner(System.in).nextInt();
        for(int i = n;i>1;i--){
        sum += getI(i);
        }
    System.out.println(n+"的阶乘和是："+sum);
    }
}
