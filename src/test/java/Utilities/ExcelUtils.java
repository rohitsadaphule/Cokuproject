package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	//String xlfile = "C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\Framework\\Excel\\coukdata.xlsx" ;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static int rowcount=0;
	public static int colcount=0;
	
	public static void main(String[] args) throws IOException {
		//getRowcount("C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\Framework\\Excel\\coukdata.xlsx", "Sheet1");
		//getColcount("C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\Framework\\Excel\\coukdata.xlsx", "Sheet1", rowcount);
		//getCellData("C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\Framework\\Excel\\coukdata.xlsx", "Sheet1", 1, 0);
	
		
	}
	
	
	public static int getRowcount(String xlfile, String sheetname) throws IOException
	{
	 fis=new FileInputStream(xlfile);
	 wb=new XSSFWorkbook(fis);
	 sh=wb.getSheet(sheetname);
	  rowcount = sh.getLastRowNum();
	 //System.out.println(rowcount);
	 return rowcount;
	 
	}
	
	public static int getColcount(String xlfile, String sheetname, int rowcount) throws IOException
	{
		fis=new FileInputStream(xlfile);
		 wb=new XSSFWorkbook(fis);
		 sh=wb.getSheet(sheetname);
		  colcount = sh.getRow(rowcount).getLastCellNum();
		// System.out.println(colcount);
		return colcount;
	}
		
	public static Object getCellData(String xlfile, String sheetname, int rowcount, int colcount) throws IOException	
	{
	    
		fis=new FileInputStream(xlfile);
		 wb=new XSSFWorkbook(fis);
		 sh=wb.getSheet(sheetname);
		 String cellData= sh.getRow(rowcount).getCell(colcount).getStringCellValue();
		 System.out.print(cellData);
		return cellData;
		
	 
	}

}
