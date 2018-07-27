package BaseClass;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class BaseClassTest extends BaseClass{

	public BaseClassTest() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void testMethod() {
		System.out.println("Test File: "+sheet.getRow(0).getCell(0).toString());
	}

}
