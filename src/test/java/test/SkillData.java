package test;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class SkillData extends ExcelDataConfig {
    //  private static final Logger LOGGER = Logger.getLogger(LoginData.class);
    public SkillData() {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "SkillTestData")
    public Object[][] SkillTestData() {

        int rows = getRowCount("Sheet3");
        int col = getColumnCount("Sheet3");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet4", i, j);
            }
        }
        return data;
    }
}
