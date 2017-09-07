package dealFile;

import java.io.File;

public class 移动目录和文件 {
	public static void main(String[] args) {
		File file = new File("D:\\"); 
		File fileBak = new File("D:\\bak");
		if(!fileBak.exists()){
			fileBak.mkdir();
		}
		CopyFile(file);
	}
	private static void CopyFile(File file){
		//如果文件是目录
		if(file.isDirectory()){
			File fileD = new File("D:\\bak\\"+file.getName());
			fileD.mkdir();
			for(File f : file.listFiles()){
				
				CopyFile(f);
			}
		}
		//如果文件不是目录
		else{
			FileOperator operator = new FileOperator();
			String str;
			try {
				str = operator.getFileContent(file);
				operator.setFileContent(str, new File("D:\\bak\\"+file.getName()));
				//file.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
