package dealFile;

import java.io.File;

public class �г������ļ��� {
	public static void main(String[] args) {
		File file1 = new File("D://");
		getName(file1);
		
	}
	
	private static void getName(File file){
		if(file.isDirectory()){
			for(File f : file.listFiles()){
				getName(f);
			}
		}else if(file.isFile()){
			System.out.println(file.getName());
		}
	}

}
