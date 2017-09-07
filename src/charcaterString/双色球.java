package charcaterString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class 双色球 {

	public static void main(String[] args) {
		
		System.out.println("双色球中奖号码：前6为红球，后1为蓝球");
		Object[] result =  getRed();
		for(Object object :result){
			System.out.print(object+"\t");
		}
		System.out.println(getBlue());
	}
	//随机数不可重复
	private static Object[] getRed(){
		Set<Integer> s = new HashSet<>();
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		for(int i = 0;i<6;i++){
			s.add(random.nextInt(32)+1);
		}
		return s.toArray();
	}
	private static int getBlue(){
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		return random.nextInt(15)+1;
	}

}
