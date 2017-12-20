package HFpoc;

import java.util.HashMap;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HFtest {
	
		String excelPath="D:\\IBM\\workspace\\RadicalSelenium1\\src\\HF\\loginDemo.xlsx";
		
		@Test(dataProvider="datatest")
		public  void test1(Map m1) throws InterruptedException{
			//Map m = (Map) obj[0][0];
			System.out.println("executing");
		}
		
		
		
		@DataProvider(name = "datatest")
		public Object[][] myDataProvider(ITestContext context, ITestNGMethod ngMethod) throws Exception {
			
			//Map datasets = this.getMethodData(context);
			Map datasets = new HashMap<>();
			Object[][] o = new Object[2][1];
			o[0][0] = datasets;
			o[1][0] = datasets;
			return o;
		}

}
