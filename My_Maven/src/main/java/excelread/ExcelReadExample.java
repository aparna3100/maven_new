package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExample {
	XSSFSheet sh;
	public ExcelReadExample() throws IOException
	{
		FileInputStream fb = new FileInputStream("C:\\Users\\user\\git\\maven_new\\My_Maven\\src\\main\\resources\\Book1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook w = new XSSFWorkbook(fb);
		sh=w.getSheet("Sheet1");
	}
	public void readFile()
	{
		for(Row r:sh)
		{
			for(Cell c:r)
			{
				System.out.print(c+" ");
			}	
		System.out.println();
		}
	}
	public  String readData(int i,int j)
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int cellType = c.getCellType();
		switch(cellType)
		{
		case Cell.CELL_TYPE_STRING:
			String data=c.getStringCellValue();
			return data;
		case Cell.CELL_TYPE_NUMERIC:
			double value = c.getNumericCellValue();
			return String.valueOf(value);
			default:
				return null;
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		ExcelReadExample obj = new ExcelReadExample();
		obj.readFile();
		String result;
		result = obj.readData(2 , 2);
		System.out.println("data "+result);

	}

}
