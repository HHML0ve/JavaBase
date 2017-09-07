package base;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("第一题：测试桌子");
		Table table = new Table("Table", 25.6f, 14.6f, 7.6f, 78.9f);
		System.out.println("桌子的面积"+table.area());
		System.out.println("桌子的各种信息"+table.Display());
		System.out.println("输入桌子的宽");
		float weight = new Scanner(System.in).nextFloat();
		table.set_tableWhrite(weight);
		System.out.println("修改后的桌子各种信息"+table.Display());
		System.out.println("第三题：测试梯形");
		
		Lader lader = new Lader();
		lader.setDemo(3, 4, 5);
		System.out.println("梯形的面积："+lader.area());
	}

}
