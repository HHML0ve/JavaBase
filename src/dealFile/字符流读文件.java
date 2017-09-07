package dealFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 借助字符流从文件中读文本
 * @author Administrator
 *
 */
public class 字符流读文件 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("D:\\a.txt"));
			BufferedReader bReader = new BufferedReader(fileReader);
			StringBuffer sb = new StringBuffer(); 
			String result = "";
 			while((result = bReader.readLine())!=null){
				sb.append(result+"\t");
			}
 			System.out.println("结果："+sb.toString());
 			fileReader.close();
 			bReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
