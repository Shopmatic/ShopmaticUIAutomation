package stage.domain.tests.in;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import ExcelData.ExcelReader;

public class connectCustomDomainTest extends BaseClass_Login{

	public connectCustomDomainTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider(name = "DomainTests")
	public static Object[] getData() throws IOException {
		ExcelReader excelReader=new ExcelReader();
		String filepath="/Users/swetha/Downloads/stocks/";
		String filename="Excel_tests.xlsx";
		String sheetName="Sheet1";
		Object[] data_excel=	excelReader.readExcel(filepath, filename, sheetName);
		return data_excel;
	}
	
	@Test(dataProvider = "DomainTests")
	public void testMethod(String email_format) {
		System.out.println(email_format);
	}

}
