package dealFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * �����ַ������ļ��ж��ı�
 * @author Administrator
 *
 */
public class �ַ������ļ� {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("D:\\a.txt"));
			BufferedReader bReader = new BufferedReader(fileReader);
			StringBuffer sb = new StringBuffer(); 
			String result = "";
 			while((result = bReader.readLine())!=null){
				sb.append(result+"\t");
			}
 			System.out.println("�����"+sb.toString());
 			fileReader.close();
 			bReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
