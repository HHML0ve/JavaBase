package charcaterString;

import java.io.BufferedWriter;

/**
 * 7��	��֪�ַ�����this is a test of java��
a)	ͳ�Ƹ��ַ�������ĸs���ֵĴ���
b)	ȡ�����ַ�����test��
c)	�ö��ַ�ʽ�����ַ����Ƶ�һ���ַ������� char [] ch��
d)	���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�����������̨
e)	�����ַ�ʽʵ�ָ��ַ����ĵ������
f)	�����ַ���ת����һ���ַ����飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ��ʣ������������̨

 * @author Administrator
 *
 */
public class �ַ���С�� {
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
		ɾ���ַ� deleteString = new ɾ���ַ�();
		String str = deleteString.deleteChar("this is a test of java", "test");
		System.out.println("�h��test����ַ���"+str);
		//һ�N��ʽ
		char[] ch = "this is a test of java".toCharArray();
		//׃��
		String[] ss = "this is a test of java".split(" ");
		StringBuffer reStringBuffer = new StringBuffer();
		for(String s :ss){
			StringBuffer sb = new StringBuffer(s);
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
			reStringBuffer.append(sb.toString()+" ");
		}
		System.out.println(reStringBuffer.toString());
		//����ݔ��
		System.out.println("����ݔ����ʽһ");
		for(int i = ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("����ݔ����ʽ��");
		StringBuffer sBuffer = new StringBuffer("this is a test of java");
		System.out.println(sBuffer.reverse().toString());
		
		//�����ַ���ת����һ���ַ����飬Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ��ʣ������������̨
		System.out.println("��Ɇ΂����~ݔ��");
		for(String s :ss){
			System.out.print(s+"\t");
		}
	}
}
