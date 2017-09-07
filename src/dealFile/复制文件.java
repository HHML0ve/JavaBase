package dealFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 将在D 盘的**文件内容复制到D盘的**文件中
 * @author Administrator
 *
 */
public class 复制文件 {
	public static void main(String[] args) throws IOException {
		File aFile = new File("D:\\a.txt");
		File bFile = new File("D:\\b.txt");
		if(!bFile.exists()){
			bFile.createNewFile();
		}
		String content = getFileContent(aFile);
		try {
			setFileContent(content, bFile);
		} catch (Exception e) {
			System.out.println("写入文件失败");
			e.printStackTrace();
		}
		
	}

	//读取文件内容:将文件中的内容写入流中
	private static String getFileContent(File file) throws IOException{
		FileReader fReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fReader);
		StringBuffer sb = new StringBuffer();
		String str = "";
		while((str = bReader.readLine())!=null){
			sb.append(str+"\r");
		}
		System.out.println("从文件中读取的内容： "+sb.toString());
		fReader.close();
		bReader.close();
		return sb.toString();
	}
	//写入文件内容:将流中的内容写入文件中
	private static void setFileContent(String string,File file) throws Exception{
		FileWriter fWriter = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(string);
		bWriter.flush();
		bWriter.close();
		fWriter.close();
	}
}
