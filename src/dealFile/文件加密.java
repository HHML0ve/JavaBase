package dealFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
public class 文件加密 {
	 private File file; // 存储文件对象信息
	    byte[] buf; // 缓冲区，存储文件中的所有数据
	    RandomAccessFile raf;//随机访问文件的读取和写入
	    public 文件加密(String filename) {
	        file = new File(filename);
	        buf = new byte[(int) file.length()];
	    }
	    // 按照读写方式打开文件
	    public void open() throws FileNotFoundException {
	        raf = new RandomAccessFile(file, "rw");
	    }
	    // 关闭文件
	    public void close() throws IOException {
	        raf.close();
	    }
	    // 对文件进行加密或解密
	    public void password() throws IOException {
	        raf.read(buf);// 将文件内容读入到缓冲区中
	        for (int i = 0; i < buf.length; i++)
	            buf[i] = (byte) (~buf[i]);// 将缓冲区中的内容按位取反
	         raf.seek(0);// 将文件指针定位到文件头部
	        raf.write(buf);// 将缓冲区中的内容写入到文件中
	    }
	    // 显示文件的内容
	    public static void showFileContent(String fileName) {
	        File file = new File(fileName);
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
	    public static void main(String argv[]) {
	    	String path = "D:\\a.txt";//指定文件加密
	        if (path.length() < 1) {
	            System.out.println("你需要指定待加密的文件名称！");
	            return;
	        }
	        // 下面利用encrypt对象oa对由命令行参数指定的文件进行加密处理
	         文件加密 oa = new 文件加密(path);
	        try {
	            oa.open();// 打开文件
	            oa.password();// 先对指定的文件加密
	            System.out.println("文件加密成功！加密后的文件内容如下：");
	            文件加密.showFileContent(path);// 显示加密后文件的内容
	            oa.password();// 再对已经加密的文件解密
	            oa.close();// 关闭文件
	            System.out.println("\n文件解密成功！解密后的文件内容如下：");
	            文件加密.showFileContent(path);// 显示解密后文件的内容
	        } catch (FileNotFoundException e) {
	            System.out.println("打不开指定文件：" + argv[0]);
	        } catch (IOException e) {
	            System.out.println("文件读写出错：" + argv[0]);
	        }
	    }
}	
