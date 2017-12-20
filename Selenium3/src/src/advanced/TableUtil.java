package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableUtil {
	
	
	public String getCellValue(WebDriver driver, String c1, String c2, String cValue){
		
		int columnIndex = 0;
		//find number of columns
		List<WebElement> eleList = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		int totalCol = eleList.size();
		for(int i=1;i<=totalCol;i++){
			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			if(columnValue.equals(c2)){
				columnIndex=i;
				break;
			}
		}
		//get company column index at runtime
		int columnIndex1 = 0;
		for(int i=1;i<=totalCol;i++){
			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			if(columnValue.equals(c1)){
				columnIndex1=i;
				break;
			}
		}
		int rowIndex = 0;
		//find row number
		List<WebElement> rowEle = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td"));
		int totalRows = rowEle.size();
		for(int j=1;j<=totalRows;j++){
			String rowValue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+j+"]/td["+columnIndex1+"]")).getText();
			if(rowValue.equals(cValue)){
				rowIndex=j;
				break;
			}
		}
		
		
		String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+columnIndex+"]/../../following-sibling::tbody/tr[3]/td["+columnIndex+"]")).getText();
		System.out.println("Value = "+cellValue);
		return cellValue;
		
	}
		
	}


