package dealFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		File file = new File("D:\\b.txt");
		if(!file.exists()){
			System.out.println("�ļ�������");
		}else{
			RandomAccessFileTest rafTest = new RandomAccessFileTest(file);
			
		}
		
	}
	//����ֵ
	private File file = null;
	private RandomAccessFile raf = null;
	private byte[] buf = null;
	//���캯��
	public RandomAccessFileTest(File file){
		buf = new byte[(int) file.length()];
		this.file = file;
	}
	//���ļ���
	public void open() throws FileNotFoundException{
		raf = new RandomAccessFile(file, "rw");
	}
	//�ر��ļ���
	public void cloae() throws IOException{
		raf.close();
	}
	
	//���ļ����м��ܻ��߽���
	public void password() throws IOException{
		raf.read(buf);
		for(int i= 0;i<buf.length;i++){
			buf[i] = (byte) ~buf[i];
		}
		//��Ҫ���ļ���ָ��ŵ�0λ��
		raf.seek(0);
		raf.write(buf);
	}
	public static void showFileContent(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
            while ((tempString = reader.readLine()) != null) {
                // ��ʾ�к�
                System.out.println(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
