package charcaterString;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * �Ƚ�����
 * @author Administrator
 *
 */
public class �Ƚ����� {
	public static void main(String[] args){
		Date date1 = new Date();
		Date date2 = new Date();
		Scanner in = new Scanner(System.in);
		String time1 = in.nextLine();
		String time2 = in.nextLine();
		SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			ParsePosition pos = new ParsePosition(0);
			date1 = sf.parse(time1,pos);
			ParsePosition pos2 = new ParsePosition(0);
			date2 = sf.parse(time2,pos2);
		} catch (Exception e) {
			System.out.println("����ʱ��ʧ��");
			e.printStackTrace();
		}
		System.out.println();
		long time3 = Math.abs(date1.getTime()-date2.getTime());
		System.out.println("���ĺ�������"+time3);
		Date date = new Date(time3);
		SimpleDateFormat sFormat = new SimpleDateFormat("dd�� HHʱmm��ss��");
		System.out.println("�����������ʱ��"+sFormat.format(date));
		
	}

}
