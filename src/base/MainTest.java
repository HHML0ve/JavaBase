package base;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("��һ�⣺��������");
		Table table = new Table("Table", 25.6f, 14.6f, 7.6f, 78.9f);
		System.out.println("���ӵ����"+table.area());
		System.out.println("���ӵĸ�����Ϣ"+table.Display());
		System.out.println("�������ӵĿ�");
		float weight = new Scanner(System.in).nextFloat();
		table.set_tableWhrite(weight);
		System.out.println("�޸ĺ�����Ӹ�����Ϣ"+table.Display());
		System.out.println("�����⣺��������");
		
		Lader lader = new Lader();
		lader.setDemo(3, 4, 5);
		System.out.println("���ε������"+lader.area());
	}

}
