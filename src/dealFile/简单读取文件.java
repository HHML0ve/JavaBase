package dealFile;

import java.io.File;
import java.io.FileInputStream;

public class 简单读取文件 {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream(new File("D:\\a.txt"));
			byte[] bs = new byte[1024*10];
			input.read(bs, 0, bs.length);
			System.out.println(new String(bs));
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
