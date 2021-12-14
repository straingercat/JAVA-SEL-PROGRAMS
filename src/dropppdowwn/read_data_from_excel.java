package dropppdowwn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_data_from_excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\punith raj.c\\Desktop\\newdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String data = book.getSheet("Datasheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
