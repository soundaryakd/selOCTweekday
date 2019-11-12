package week4.day1;


	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ReadExcel extends LearnParameters {
		
	public static String[][] readData(String fiName) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+fiName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		String[][] data=new String[rowNum][cellNum];
		
		for (int j = 1; j <= rowNum ; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0;i<cellNum ; i++) {
				XSSFCell cell = row.getCell(i);
				/*
				 * String value = cell.getStringCellValue(); System.out.print(value+"\t");
				 */
				data[j-1][i]=cell.getStringCellValue();
				
				
			} 
			System.out.println();
		}
		wbook.close();
		return data;
		
		
		
	}}
