/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


        
public class Excel {
    
    private static final String FILE_NAME = "FR_02_MT.xlsx";
    private static final String newFileName = "C://Users/sait_/Desktop/yeni4.xlsx";
    
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(FILE_NAME));
        Workbook workbook = WorkbookFactory.create(inputStream);
        //XSSFWorkbook workbook = new XSSFWorkbook(); 
        // XSSFSheet sheet = workbook.createSheet("Deneme Sayfası"); 
        Sheet sheet = workbook.getSheetAt(0);
        int rowNum=10;
        int colNum=10;
        Row row = sheet.createRow(rowNum);
        Cell cell = row.createCell(colNum++);
        cell.setCellValue((String) "deneme10");
        
        try {
            FileOutputStream outputStream = new FileOutputStream(newFileName);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        
    }
    
}
