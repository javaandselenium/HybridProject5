package com.Ecommerce.SkillRary.Signup.genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author QSP
 *
 */
public class FileUtilies {
	/**
	 * it is used to handle the property file
	 * 
	 * @param keys
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getPropertyFile(String keys) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.propertyfilepath));
		return p.getProperty(keys);
	}

	/**
	 * It is used to read the data from the excel sheet
	 * 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */

	public String getExcelfile(String sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(AutoConstant.excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		String s = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return s;
	}

}
