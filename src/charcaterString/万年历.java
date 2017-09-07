package charcaterString;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class ������ {
	
	public static void main(String[] args){
		System.out.println("start");
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("awdrtgdss");
		System.out.println(getHuiwen(sBuffer));
		
		//�ж�����
		System.out.println("�ж�����");
		String Emial = new Scanner(System.in).nextLine();
		System.out.println(isEmial(Emial));
		
		//������
		System.out.println("������");
		System.out.println("������ݣ�����");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int month = in.nextInt();
		WNL(year,month);
		
	}
	//����
	private static StringBuffer getHuiwen(StringBuffer stringBuffer){
		StringBuffer result = new StringBuffer();
		result.append(stringBuffer);
		result.append(stringBuffer.reverse());
		return result;	
		
	}

	
	//�ж�����
	private static boolean isEmial(String Emial){
		if(Emial.contains("@")&&Emial.contains(".")&&!Emial.contains("@.")){
			if((Emial.indexOf('@')-Emial.indexOf('.'))<0)
			return true;	
		}
		return false;
	}
	
	//������--�����꣬�£��ҳ���һ�����ڵ����ڡ��жϸ��µ����һ������ڡ�
	private static void WNL(int year,int month){
		Calendar calendar = Calendar.getInstance();
		int days = Days(year, month);
		calendar.set(year, month-1,1);
		//��ȡһ���м���
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("Week:"+week);
		int[] wnl = new int[42];
		for(int i = 1;i<=days;i++){
			wnl[week++] = i;
		}
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i = 0;i<=week;i++){
			if(wnl[i]!=0){
				System.out.print(wnl[i]+"\t");
				if((i+1)%7 == 0){
					System.out.println();
				}
			}else{
				System.out.print("\t");
			}
		}
	}
	//�ж�����
	private static int Days(int year,int month){
		
		int days  = 0;
		if(month == 1||month == 3||month == 5||month ==7||month == 8||month == 10|| month == 12){
			days = 31;
		}
		if(month == 4||month == 6||month == 9||month == 11){
			days = 30;
		}
		if(month == 2){
			if((year%4 == 0&& year%100!=0)||year%400 == 0){
				days = 29;
			}else{
				days = 28;
			}
		}
		
		return days;
	}
	
	
}
