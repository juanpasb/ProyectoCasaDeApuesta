package co.edu.unbosque.model.persistence;

import java.io.File;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import co.edu.unbosque.model.Apostadores;


public class InformePdf {
/**
 * Este metodo sirve para crear el informe pdf de los apostadores
 */
	public InformePdf() {

			OperacionArchivo archivo = new OperacionArchivo();
			Document document = new Document();

			try {
				FileOutputStream ficheroPdf = new FileOutputStream("Informe Apostadores.pdf");

				PdfWriter.getInstance(document, ficheroPdf).setInitialLeading(20);

				document.open();

				ArrayList<Apostadores> apostadores = archivo.leerArchivo(new File("apostadores.dat"));
				for (Apostadores apostadores1 : apostadores) {
					PdfPTable table = new PdfPTable(4);
					table.addCell("Nombre ");
					table.addCell("Cedula ");
					table.addCell("Sede ");
					table.addCell("Celular ");
					table.addCell(apostadores1.getNombre());
					table.addCell(apostadores1.getCedula());
					table.addCell(apostadores1.getSede());
					table.addCell(apostadores1.getCelular());

					PdfPCell celdaFinal = new PdfPCell(new Paragraph("Informes Apostadores "));

					// Indicamos cuantas columnas ocupa la celda
					celdaFinal.setColspan(4);
					table.addCell(celdaFinal);

					// Agregamos la tabla al documento
					document.add(table);
				}
				document.close();

			} catch (Exception e) {
				System.out.println("error");
				e.printStackTrace();
			}
		}

}
