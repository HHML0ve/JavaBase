package dealFile;

import java.io.File;

public class ��д���ļ� {
	public static void main(String[] args) {
		File file = new File("D:\\javaFileDemo\\file2.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
				//file.createNewFile();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileOperator operator = new FileOperator();
			String string= "2017��09��7�գ���������ѧϰ��Java���ļ���д������";
			String string2 = "���Ѿ�����FileWriter��BufferedWriter��д�ļ���";
			String string3 = "\r\n";
			try {
				operator.setFileContent2(string, file);
				operator.setFileContent2(string3, file);
				operator.setFileContent2(string2, file);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
