package com.MavenProject;

	import java.io.File;
	import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ReadData {
		public static void main(String[] args) throws Throwable {
			//to read a file
			File f =new File("C:\\Users\\Jose\\eclipse-workspace\\MavenProject\\December Data Driven.xlsx");
			
			//to read file data values
			FileInputStream fis = new FileInputStream(f);
			
			//to read a excel sheet
			Workbook wb = new XSSFWorkbook(fis);
			
			//sheet//rows//column//data
			//to read data from sheet
			Sheet sheetAt = wb.getSheetAt(0);
			//int row_size = sheetAt.getPhysicalNumberOfRows();
			
			//get data using loop
			//for (int i = 0; i < row_size; i++) {
				Row row = sheetAt.getRow(2);//to get row value
				//int cell_size = row.getPhysicalNumberOfCells();
				
				//for (int j = 0; j < cell_size; j++) {
					Cell cell = row.getCell(1);//to get column value
					CellType cellType = cell.getCellType();

					
					if (cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
						}
					
					else if (cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int value = (int) numericCellValue;
						System.out.println(value);
						
					}
					
					
				}}
				
			

		

	
	
