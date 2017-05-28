package Training;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Studentscore {

	public static void main(String[] args) throws BiffException, IOException {

		File file1 = new File("C:\\studentscore.xls");
		Workbook wb = Workbook.getWorkbook(file1);
		Sheet sh1 = wb.getSheet("student");
		sh1.getCell(9,3).
		
		

	}

}
