import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ReadExcelExample {

    public static String readExcelContent(int rowNumber, int columnNumber) throws IOException{
        String filePath = "C:\\Users\\nanli\\IdeaProjects\\Logistic-Zealots\\Test\\testData.xlsx";
        // create a file object
        File file = new File(filePath);
        // create a FileInputStream object
        FileInputStream inputStream = new FileInputStream(file);
        // create a Workbook object
        Workbook workbook = WorkbookFactory.create(inputStream);

        // Get the first row from the sheet
        Row row = workbook.getSheetAt(0).getRow(rowNumber);
        // Get the first cell from the row
        Cell cell = row.getCell(columnNumber);
        String cellValue = null;
        if (cell.getCellType() == CellType.STRING) {
            cellValue = cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            cellValue = String.valueOf(cell.getNumericCellValue());
        }
        return cellValue;
    }
}
