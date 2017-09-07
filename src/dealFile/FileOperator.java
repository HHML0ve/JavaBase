package dealFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperator {
	//��ȡ�ļ�����:���ļ��е�����д������
		public String getFileContent(File file) throws IOException{
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			StringBuffer sb = new StringBuffer();
			String str = "";
			while((str = bReader.readLine())!=null){
				sb.append(str+"\r");
			}
			System.out.println("���ļ��ж�ȡ�����ݣ� \r\n"+sb.toString());
			fReader.close();
			bReader.close();
			return sb.toString();
		}
		//д���ļ�����:�����е�����д���ļ���
		public void setFileContent(String string,File file) throws Exception{
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(string);
			bWriter.flush();
			bWriter.close();
			fWriter.close();
		}
		//׷��д���ļ�
		public void setFileContent2(String string,File file) throws Exception{
			FileWriter fWriter = new FileWriter(file,true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(string);
			bWriter.flush();
			bWriter.close();
			fWriter.close();
		}
}
