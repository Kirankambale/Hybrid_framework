package Generic_Script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Generic_read_excel {
	public static String main(String []args) throws EncryptedDocumentException, IOException
	{
		String value="";
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Darshan\\Desktop\\testdata.xls");
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("sheet");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value1  = cell.toString();
	
		}
		catch (Exception e) {
			System.out.println("unable  to open");
		}
		return value;


}
	
}

