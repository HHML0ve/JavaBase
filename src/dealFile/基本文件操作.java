package dealFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class �����ļ����� {

	public static void main(String[] args) {
		File file = new File("D:\\Tian.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("�����ļ�ʧ��");
				e.printStackTrace();
			}
		}
		//д���ݽ��ļ�
		String string = new Scanner(System.in).nextLine();
		FileOperator operator = new FileOperator();
		try {
			operator.setFileContent(string, file);
		} catch (Exception e) {
			System.out.println("д���ļ�ʧ��");
			e.printStackTrace();
		}
		
		//�����ļ��ĸ�������
		System.out.println("�ļ��ľ���·����"+file.getAbsolutePath());
		System.out.println("�ļ������޸�ʱ�䣺"+file.lastModified());
		System.out.println("�ļ�������"+file.getName());
		
	}
}
