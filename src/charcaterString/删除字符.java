package charcaterString;
/**
 * 5��	��дһ��������ַ�����ɾ���������ַ�
 * @author Administrator
 *
 */
public class ɾ���ַ� {
	public static void main(String[] args) {
		String string = "qweretefjsdkfsd";
		char c = 'e';
		String cc = c+"";
		
		System.out.println("��������ַ���"+deleteChar(string, cc));
	}
	
	public static String deleteChar(String str,String c){
		
		StringBuffer sBuffer = new StringBuffer();
		String[] result = str.split(c);
		for(String s :result){
			sBuffer.append(s);
		}
		return sBuffer.toString();
	}

}
