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
			System.out.println("文件不存在");
		}else{
			RandomAccessFileTest rafTest = new RandomAccessFileTest(file);
			
		}
		
	}
	//属性值
	private File file = null;
	private RandomAccessFile raf = null;
	private byte[] buf = null;
	//构造函数
	public RandomAccessFileTest(File file){
		buf = new byte[(int) file.length()];
		this.file = file;
	}
	//打开文件流
	public void open() throws FileNotFoundException{
		raf = new RandomAccessFile(file, "rw");
	}
	//关闭文件流
	public void cloae() throws IOException{
		raf.close();
	}
	
	//对文件进行加密或者解密
	public void password() throws IOException{
		raf.read(buf);
		for(int i= 0;i<buf.length;i++){
			buf[i] = (byte) ~buf[i];
		}
		//需要将文件的指针放到0位置
		raf.seek(0);
		raf.write(buf);
	}
	public static void showFileContent(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
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
