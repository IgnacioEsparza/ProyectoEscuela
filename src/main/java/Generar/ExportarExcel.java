/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


/**
 * la clase se encarga de exportar en un archivo xls o excel cual quier informacion
 * de una JTable que se le haya enviado
 * @author Ignacio Esparza
 */
public class ExportarExcel {
    Workbook wb;
    
    /**
     * 
     * @param archivo es el documento que se enviará para luego ser creado, el cual
     * tiene que tener el nombre
     * @param tabla la Jtable que contiene la información que será exportada
     */
    public void exportar(File archivo,JTable tabla ){
        int numFila=tabla.getRowCount(), numColumna=tabla.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb=new HSSFWorkbook();//esto es sólo para darle un formato
        }else{
            wb= new XSSFWorkbook();
        }
        Sheet hoja =wb.createSheet("Registro");
        try {
            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i+1);
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(tabla.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(tabla.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            JOptionPane.showMessageDialog(null, "Exportado con Éxito");
        } catch (Exception e) {
        }
    }
}
