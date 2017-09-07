package charcaterString;

import java.io.BufferedWriter;

/**
 * 7、	已知字符串“this is a test of java”
a)	统计该字符串中字母s出现的次数
b)	取出子字符串“test”
c)	用多种方式将本字符复制到一个字符数组中 char [] ch中
d)	将字符串中每个单词的第一个字母变成大写，输出到控制台
e)	用两种方式实现该字符串的倒叙输出
f)	将本字符串转换成一个字符数组，要求每个数组元素都是一个有意义的英文单词，并输出到控制台

 * @author Administrator
 *
 */
public class 字符串小结 {
	private static int getTotalChar(String str,char c){
		int result = 0;
		char[] ss = str.toCharArray();
		for(char s :ss){
			if(c == s){
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getTotalChar("this is a test of java", 's'));
		删除字符 deleteString = new 删除字符();
		String str = deleteString.deleteChar("this is a test of java", "test");
		System.out.println("刪除test后的字符串"+str);
		//一種方式
		char[] ch = "this is a test of java".toCharArray();
		//變大寫
		String[] ss = "this is a test of java".split(" ");
		StringBuffer reStringBuffer = new StringBuffer();
		for(String s :ss){
			StringBuffer sb = new StringBuffer(s);
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
			reStringBuffer.append(sb.toString()+" ");
		}
		System.out.println(reStringBuffer.toString());
		//倒序輸出
		System.out.println("倒序輸出方式一");
		for(int i = ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("倒序輸出方式二");
		StringBuffer sBuffer = new StringBuffer("this is a test of java");
		System.out.println(sBuffer.reverse().toString());
		
		//将本字符串转换成一个字符数组，要求每个数组元素都是一个有意义的英文单词，并输出到控制台
		System.out.println("拆成單個單詞輸出");
		for(String s :ss){
			System.out.print(s+"\t");
		}
	}
}
