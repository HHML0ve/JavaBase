package dealFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
public class �ļ����� {
	 private File file; // �洢�ļ�������Ϣ
	    byte[] buf; // ���������洢�ļ��е���������
	    RandomAccessFile raf;//��������ļ��Ķ�ȡ��д��
	    public �ļ�����(String filename) {
	        file = new File(filename);
	        buf = new byte[(int) file.length()];
	    }
	    // ���ն�д��ʽ���ļ�
	    public void open() throws FileNotFoundException {
	        raf = new RandomAccessFile(file, "rw");
	    }
	    // �ر��ļ�
	    public void close() throws IOException {
	        raf.close();
	    }
	    // ���ļ����м��ܻ����
	    public void password() throws IOException {
	        raf.read(buf);// ���ļ����ݶ��뵽��������
	        for (int i = 0; i < buf.length; i++)
	            buf[i] = (byte) (~buf[i]);// ���������е����ݰ�λȡ��
	         raf.seek(0);// ���ļ�ָ�붨λ���ļ�ͷ��
	        raf.write(buf);// ���������е�����д�뵽�ļ���
	    }
	    // ��ʾ�ļ�������
	    public static void showFileContent(String fileName) {
	        File file = new File(fileName);
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
	    public static void main(String argv[]) {
	    	String path = "D:\\a.txt";//ָ���ļ�����
	        if (path.length() < 1) {
	            System.out.println("����Ҫָ�������ܵ��ļ����ƣ�");
	            return;
	        }
	        // ��������encrypt����oa���������в���ָ�����ļ����м��ܴ���
	         �ļ����� oa = new �ļ�����(path);
	        try {
	            oa.open();// ���ļ�
	            oa.password();// �ȶ�ָ�����ļ�����
	            System.out.println("�ļ����ܳɹ������ܺ���ļ��������£�");
	            �ļ�����.showFileContent(path);// ��ʾ���ܺ��ļ�������
	            oa.password();// �ٶ��Ѿ����ܵ��ļ�����
	            oa.close();// �ر��ļ�
	            System.out.println("\n�ļ����ܳɹ������ܺ���ļ��������£�");
	            �ļ�����.showFileContent(path);// ��ʾ���ܺ��ļ�������
	        } catch (FileNotFoundException e) {
	            System.out.println("�򲻿�ָ���ļ���" + argv[0]);
	        } catch (IOException e) {
	            System.out.println("�ļ���д����" + argv[0]);
	        }
	    }
}	
