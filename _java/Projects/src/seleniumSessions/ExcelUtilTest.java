package seleniumSessions;

public class ExcelUtilTest {
    public static void main(String[] args) {
        Xls_Reader reader = new Xls_Reader("C:\\Automation\\src\\data\\TestData.xlsx");
        String SheetName = "Login";
        String data = reader.getCellData(SheetName,0,2);
        System.out.println(data);

        int rowCount = reader.getRowCount("Login");
        System.out.println("Total Rows"+rowCount);

//        reader.addColumn(SheetName,"Status");
        if (!reader.isSheetExist("Registration")){
                    reader.addSheet("Registration");
        }

//        reader.setCellData("Login","Status",2,"Pass");
        System.out.println(reader.getCellData("Login","username",2));

        System.out.println(reader.getColumnCount(SheetName));

//        reader.removeColumn();
    }
}
