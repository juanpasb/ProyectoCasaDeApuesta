package co.edu.unbosque.model.persistence;

//public class InformeExcel {
//
//}

import java.io.File;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import co.edu.unbosque.model.Apostadores;
//import co.edu.unbosque.persistence;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class InformeExcel {

/**
 * Este metodo sirve para crear el informe en excel
 */
	public InformeExcel() {
		HSSFWorkbook objWB = new HSSFWorkbook();

		// Creo la hoja
		HSSFSheet hoja1 = objWB.createSheet("hoja 1");

		// Proceso la información y genero el xls.
		HSSFRow fila = hoja1.createRow((short) 0);

		// Aunque no es necesario podemos establecer estilos a las celdas.
		// Primero, establecemos el tipo de fuente
		HSSFFont fuente = objWB.createFont();
		fuente.setFontHeightInPoints((short) 11);
		fuente.setFontName(fuente.FONT_ARIAL);
		fuente.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

		// Luego creamos el objeto que se encargará de aplicar el estilo a la celda
		HSSFCellStyle estiloCelda = objWB.createCellStyle();
		estiloCelda.setWrapText(true);
		estiloCelda.setAlignment(HSSFCellStyle.ALIGN_JUSTIFY);
		estiloCelda.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
		estiloCelda.setFont(fuente);

		// También, podemos establecer bordes...
		estiloCelda.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
		estiloCelda.setBottomBorderColor((short) 8);
		estiloCelda.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
		estiloCelda.setLeftBorderColor((short) 8);
		estiloCelda.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
		estiloCelda.setRightBorderColor((short) 8);
		estiloCelda.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
		estiloCelda.setTopBorderColor((short) 8);

		// Establecemos el tipo de sombreado de nuestra celda
		estiloCelda.setFillForegroundColor((short) 22);
		estiloCelda.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

		// Creamos la celda, aplicamos el estilo y definimos
		// el tipo de dato que contendrá la celda
		HSSFCell celda = fila.createCell((short) 0);
		celda.setCellStyle(estiloCelda);
		celda.setCellType(HSSFCell.CELL_TYPE_STRING);

		HSSFCell celda1 = fila.createCell((short) 1);
		celda1.setCellStyle(estiloCelda);
		celda1.setCellType(HSSFCell.CELL_TYPE_STRING);

		HSSFCell celda2 = fila.createCell((short) 2);
		celda2.setCellStyle(estiloCelda);
		celda2.setCellType(HSSFCell.CELL_TYPE_STRING);

		HSSFCell celda3 = fila.createCell((short) 3);
		celda3.setCellStyle(estiloCelda);
		celda3.setCellType(HSSFCell.CELL_TYPE_STRING);

		HSSFCell celda4 = fila.createCell((short) 4);
		celda4.setCellStyle(estiloCelda);
		celda4.setCellType(HSSFCell.CELL_TYPE_STRING);

		// Finalmente, establecemos el valor
		OperacionArchivo op = new OperacionArchivo();
		ArrayList<Apostadores> apostadores = op.leerArchivo(new File("apostadore.dat"));
		for (int i = 0; i < apostadores.size(); i++) {
			Apostadores apostadores1 = apostadores.get(i);
			HSSFRow filaTemporal = hoja1.createRow((short) i + 1);
			celda.setCellValue("Nombres");
			celda1.setCellValue("Cedula");
			celda2.setCellValue("Sede");
			celda3.setCellValue("Celular");
			filaTemporal.createCell(0).setCellValue(apostadores1.getNombre());
			filaTemporal.createCell(1).setCellValue(apostadores1.getCedula());
			filaTemporal.createCell(2).setCellValue(apostadores1.getSede());
			filaTemporal.createCell(3).setCellValue(apostadores1.getCelular());

		}

		// Volcamos la información a un archivo.

		try {
			FileOutputStream elFichero = new FileOutputStream("Informe apostadores.xls");
			objWB.write(elFichero);
			elFichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}