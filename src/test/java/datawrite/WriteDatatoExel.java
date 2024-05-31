package datawrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class WriteDatatoExel {
	@SuppressWarnings("rawtypes")
	@Test
	public void dataToExel() throws IOException
	{
		FileInputStream fis=new FileInputStream("d:\\selenium\\book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		org.apache.poi.ss.usermodel.Cell cell=row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("anydata");
		FileOutputStream fos=new FileOutputStream("d:\\selenium\\book1.xlsx");
		wb.close();
		
		
		
	}

}
