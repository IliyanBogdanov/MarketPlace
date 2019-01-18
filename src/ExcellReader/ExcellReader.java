package ExcellReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {

	public XSSFSheet AddressesListSheet;
	public XSSFWorkbook wb;
	public FileInputStream fis;
	
	public ExcellReader(String path) throws IOException
	{
		try
		{
			File src=new File(path);
			fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			AddressesListSheet= wb.getSheetAt(0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void ExcellWriter(int RowNumber, String ValidationResult, String TaxValue) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		   InputStream inp = new FileInputStream("/Users/nenko/Documents/WacomTestingProjects/MarketPlace/ExcellData/exmapleAddressUSA1-1.xlsx");
		   Workbook wb = WorkbookFactory.create(inp);
		   Sheet sheet = wb.getSheetAt(0);
		   Row row = sheet.getRow(RowNumber);
		   Cell cell = row.getCell(RowNumber);
		   cell = row.createCell(8);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   cell.setCellValue(ValidationResult);

	       cell = row.createCell(9);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	   	   cell.setCellValue(TaxValue);

	   	   FileOutputStream fileOut = new FileOutputStream("/Users/nenko/Documents/WacomTestingProjects/MarketPlace/ExcellData/exmapleAddressUSA1-1.xlsx");
		   wb.write(fileOut);
		   fileOut.close();
	}
	
	public String GetAbbreviation(int row)
	{
		String GetAbbreviationValue=AddressesListSheet.getRow(row).getCell(1).getStringCellValue().trim();
		return GetAbbreviationValue;
	}
	
	public String GetState(int row)
	{
		String GetStateValue=AddressesListSheet.getRow(row).getCell(2).getStringCellValue().trim();
		return GetStateValue;
	}
	
	public String GetCity(int row)
	{
		String GetCityValue=AddressesListSheet.getRow(row).getCell(3).getStringCellValue().trim();
		return GetCityValue;
	}
	
	public String GetAddress(int row)
	{
		String GetAddressValue=AddressesListSheet.getRow(row).getCell(4).getStringCellValue().trim();
		return GetAddressValue;
	}
	
	public String GetZipCode(int row)
	{
		String GetZipCode=null;
		int GetZipCodeCellType=AddressesListSheet.getRow(row).getCell(5).getCellType();
		int GetZipCodeInt=0;
		if(GetZipCodeCellType==0)
		{
			GetZipCodeInt=(int) AddressesListSheet.getRow(row).getCell(5).getNumericCellValue();
			GetZipCode=Integer.toString(GetZipCodeInt).trim();
		}else
		{
		 GetZipCode=AddressesListSheet.getRow(row).getCell(5).getStringCellValue().trim();
		}
		GetZipCode=GetZipCode.replace(" ", "").trim();
		return GetZipCode;
	}
	
	public int CountAllCells()
	{
		return AddressesListSheet.getLastRowNum();
	}

}
