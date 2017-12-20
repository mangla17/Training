package HF;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import datadriven.ReadExcelSheet;

/**
 * Hybrid framework
 * @author Anil
 *
 */

public class KeywordDrivenScript3 {
	
	String excelPath="D:\\IBM\\workspace\\RadicalSelenium1\\src\\HF\\loginDemo.xlsx";
	
	@Test(dataProvider="MyDataProvider")
	public void loginFacebook(Object o1) throws InvalidFormatException, IOException{
		Map map = (Map) o1;
		String key = (String) map.get("key");
		String locType = (String) map.get("locType");
		String locValue = (String) map.get("locValue");
		String param = (String) map.get("param");
		System.out.println("abd");
		
//		WebDriver driver = new FirefoxDriver();
//		DataProcess proce;
//		//Object[][] obj =  dataFromProvider();
//		//int len =obj.length;
//		for(int j=0;j<3;j++){
//			Object[][] obj =  dataFromProvider();
//				for (int i = 0; i < obj.length; i++) {
//					String key =   (String) obj[i][0];
//					String locType= (String) obj[i][1];
//					String locValue = (String) obj[i][2];
//					String param = (String) obj[i][3];
//					//proce = new DataProcess(key, locType, locValue, param);
//					proce = new DataProcess();
//					proce.performAction(driver, key, locType, locValue,param);
//				}
//		}
}


	@DataProvider(name="MyDataProvider")
	public Object[][] dataFromProvider() throws InvalidFormatException, IOException{
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath);
		Map  myMap = new LinkedHashMap<>();
		Map  rowMap = new LinkedHashMap<>();
		
		int dataRowCount=excelObj.getRowCount(1);
		int rowCount = excelObj.getRowCount(0);
		dataRowCount = dataRowCount+1;
		rowCount =rowCount+1;
		
		Object[][] ExecCount = new Object[dataRowCount][1];
		Object[][] data = new Object[rowCount][4];
		
		int l = ExecCount.length;
		
		for(int j=0;j<dataRowCount;j++ ){
			for(int i=0;i<3;i++ ){
				myMap.put("key", excelObj.getCellData(0,i, 0));
				myMap.put("locType", excelObj.getCellData(0,i, 1));
				myMap.put("locValue", excelObj.getCellData(0,i, 2));
				myMap.put("param", excelObj.getCellData(1,j, i));
				data[i][0] = myMap;
				
			}
//			ExecCount[j][0]=data;
			
			ExecCount[j][0] = data;
			
		}
		
//		Object[][] o = new Object[1][1];
//		o[0][0] = data;
		return ExecCount;
	}
	
	
	//Map datasets = this.getMethodData(context);
	//Object[][] o = new Object[1][1];
	//o[0][0] = datasets;

}

//data[i][0]=excelObj.getCellData(0,i, 0);
//data[i][1]=excelObj.getCellData(0,i, 1);
//data[i][2]=excelObj.getCellData(0,i, 2);
//data[i][3]=excelObj.getCellData(1,j, i);

//data[0][0]=excelObj.getCellData(0,0, 0);
//data[0][1]=excelObj.getCellData(0,0, 1);
//data[0][2]=excelObj.getCellData(0,0, 2);
//data[0][3]=excelObj.getCellData(1,i, 0);
//
//data[1][0]=excelObj.getCellData(0,1, 0);
//data[1][1]=excelObj.getCellData(0,1, 1);
//data[1][2]=excelObj.getCellData(0,1, 2);
//data[1][3]=excelObj.getCellData(1,i, 1);
//
//data[2][0]=excelObj.getCellData(0,2, 0);
//data[2][1]=excelObj.getCellData(0,2, 1);
//data[2][2]=excelObj.getCellData(0,2, 2);
//data[2][3]=excelObj.getCellData(1,i, 2);
