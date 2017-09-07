package dealFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class 基本文件操作 {

	public static void main(String[] args) {
		File file = new File("D:\\Tian.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("创建文件失败");
				e.printStackTrace();
			}
		}
		//写内容进文件
		String string = new Scanner(System.in).nextLine();
		FileOperator operator = new FileOperator();
		try {
			operator.setFileContent(string, file);
		} catch (Exception e) {
			System.out.println("写进文件失败");
			e.printStackTrace();
		}
		
		//读出文件的各种属性
		System.out.println("文件的绝对路径："+file.getAbsolutePath());
		System.out.println("文件最后的修改时间："+file.lastModified());
		System.out.println("文件的名字"+file.getName());
		
	}
}
