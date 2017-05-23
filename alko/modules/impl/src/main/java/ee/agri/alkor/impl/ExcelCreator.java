package ee.agri.alkor.impl;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import ee.agri.alkor.impl.util.ExcelFile;
import ee.agri.alkor.service.SearchFilter;

public class ExcelCreator {

	/**
	 * Creates an excel file from the
	 * @param filter
	 * @param output
	 */
	public static void createExcelFile(SearchFilter filter, OutputStream output) {

		HSSFWorkbook workbook = new ExcelFile(filter);

		try {
			workbook.write(output);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { output.close(); } catch (IOException ioe) { ioe.printStackTrace(); }
		}


	}

}