package dealFile;

import java.io.File;

public class 简单写入文件 {
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
			String string= "2017年09月7日，今天我们学习了Java中文件读写！！！";
			String string2 = "我已经会用FileWriter和BufferedWriter读写文件了";
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
