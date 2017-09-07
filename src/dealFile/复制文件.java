package dealFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ����D �̵�**�ļ����ݸ��Ƶ�D�̵�**�ļ���
 * @author Administrator
 *
 */
public class �����ļ� {
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
			System.out.println("д���ļ�ʧ��");
			e.printStackTrace();
		}
		
	}

	//��ȡ�ļ�����:���ļ��е�����д������
	private static String getFileContent(File file) throws IOException{
		FileReader fReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fReader);
		StringBuffer sb = new StringBuffer();
		String str = "";
		while((str = bReader.readLine())!=null){
			sb.append(str+"\r");
		}
		System.out.println("���ļ��ж�ȡ�����ݣ� "+sb.toString());
		fReader.close();
		bReader.close();
		return sb.toString();
	}
	//д���ļ�����:�����е�����д���ļ���
	private static void setFileContent(String string,File file) throws Exception{
		FileWriter fWriter = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(string);
		bWriter.flush();
		bWriter.close();
		fWriter.close();
	}
}
