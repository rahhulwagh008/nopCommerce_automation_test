package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParaUtils 

{
	
	public static FileInputStream file;
	
	public static XSSFWorkbook work;
	
	public static XSSFSheet sheet;
	
	public static XSSFRow row;
	
	public static XSSFCell cell;
	
	
	public static int getLrow(String xfile,String xsheet) throws IOException 
	{
		file = new FileInputStream(xfile);
		
		work = new XSSFWorkbook(file);
		
		sheet = work.getSheet(xsheet);
		
		int Lrow = sheet.getLastRowNum();
		
		return Lrow;
	}
		
		
	public static int getLcell(String xfile,String xsheet,int rownum) throws IOException
		{
			file = new FileInputStream(xfile);
			
			work = new XSSFWorkbook(file);
			
			sheet = work.getSheet(xsheet);
			
			row = sheet.getRow(rownum);
			
			int Lcell= row.getLastCellNum();
			
			return Lcell;	
			
		}
	
	public static String getcelldata(String xfile,String xsheet,int rownum,int colnum) throws IOException
	{
		file = new FileInputStream(xfile);
		
		work = new XSSFWorkbook(file);
		
		sheet = work.getSheet(xsheet);
		
		row = sheet.getRow(rownum);
		
		cell=row.getCell(colnum);
		
		String data;
        
        try {
        DataFormatter formatter = new DataFormatter();
        String Celldata =formatter.formatCellValue(cell);
        
        return Celldata;
        }
        catch (Exception e) {

        	data="";
  		}
		return data;  
        
	}
	

}
