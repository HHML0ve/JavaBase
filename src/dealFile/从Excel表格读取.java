package dealFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class 从Excel表格读取 {
	public static void main(String[] args){
		System.out.println("方法一");
		method1();
		System.out.println();
		System.out.println("方法二");
		method2();
	}
	public static void method1(){

		HSSFWorkbook wb = null;
		try{
			wb = new HSSFWorkbook(new FileInputStream(new File("d:/students.xls")));
			//获取表0
			HSSFSheet sheet = wb.getSheetAt(0);
			HSSFRow row;
			HSSFCell cell;
			//判断最大的行与列有内容
			
			for(int i = 0;i<6;i++){
				 row = sheet.getRow((short)i);
				for(int j = 0;j<6;j++){
					 cell = row.getCell(j);
					 //判断
					 if(i>0){
						 switch (j) {
						case 0:
							 System.out.print((int)cell.getNumericCellValue() + "\t");
							break;
						case 1:
							 System.out.print(cell.getStringCellValue() + "\t");
							break;
						case 2 :
							 System.out.print((int)cell.getNumericCellValue() + "\t");
							break;
						case 3:
							System.out.print(cell.getStringCellValue() + "\t");
							break;
						}
					 }else{
							
							System.out.print( cell.getStringCellValue()+"\t");
						}
				}
				System.out.println();
			}
		}catch(Exception e){
			
		}
	}
	
	public static void method2(){
		try {
			InputStream is = new FileInputStream(new File("d:/students.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(is));
			ExcelExtractor extractor = new ExcelExtractor(wb);
			extractor.setIncludeSheetNames(true);
			extractor.setFormulasNotResults(false);
			extractor.setIncludeCellComments(true);
			String text = extractor.getText();
			System.out.println(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
