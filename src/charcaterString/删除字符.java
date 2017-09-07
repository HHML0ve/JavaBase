package charcaterString;
/**
 * 5¡¢	±àÐ´Ò»¸ö³ÌÐò´Ó×Ö·û´®ÖÐÉ¾³ý¸ø¶¨µÄ×Ö·û
 * @author Administrator
 *
 */
public class É¾³ý×Ö·û {
	public static void main(String[] args) {
		String string = "qweretefjsdkfsd";
		char c = 'e';
		String cc = c+"";
		
		System.out.println("²Ù×÷ºóµÄ×Ö·û´®"+deleteChar(string, cc));
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
