package dealFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperator {
	//读取文件内容:将文件中的内容写入流中
		public String getFileContent(File file) throws IOException{
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			StringBuffer sb = new StringBuffer();
			String str = "";
			while((str = bReader.readLine())!=null){
				sb.append(str+"\r");
			}
			System.out.println("从文件中读取的内容： \r\n"+sb.toString());
			fReader.close();
			bReader.close();
			return sb.toString();
		}
		//写入文件内容:将流中的内容写入文件中
		public void setFileContent(String string,File file) throws Exception{
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(string);
			bWriter.flush();
			bWriter.close();
			fWriter.close();
		}
		//追加写入文件
		public void setFileContent2(String string,File file) throws Exception{
			FileWriter fWriter = new FileWriter(file,true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(string);
			bWriter.flush();
			bWriter.close();
			fWriter.close();
		}
}
