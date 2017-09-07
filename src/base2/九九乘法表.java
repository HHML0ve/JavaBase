package base2;

/**
 * @author Administrator
 */
public class 九九乘法表 {
    public static void main(String[] args){
        System.out.println("九九乘法表");
    for(int i = 1;i<=9;i++){
        System.out.print(i+"  ");
    for(int k = 1;k<=i;k++)
        System.out.print(i+"*"+k+"="+i*k+"    ");
     System.out.println();
    }
   
    }
    
}
