package poc;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyAllUIElement {
	
	
	@Test
	public void test1() throws InterruptedException{
		
		WebDriver ffdriver = new FirefoxDriver();
		
		ffdriver.get("http://demo.automationtesting.in/Register.html");
		ffdriver.manage().window().maximize();
		Thread.sleep(5000);
		
//	//combobox selection
//		WebElement element = ffdriver.findElement(By.id("countries"));
//		Select oSelect = new Select(element);
//		oSelect.selectByValue("Austria");
//		
//	//radiobutton
//		//if you want to know the number of radio buttons
//		List<WebElement> radioGroup1 = ffdriver.findElements(By.name("radiooptions"));
//		System.out.println(radioGroup1.size());
//		
//		//get the text of radio button
//		System.out.println(radioGroup1.get(1).getText());
//		     
//	    //If u want to check whether the radio button is selected or not
//	    if(radioGroup1.get(0).isSelected()){
//	        System.out.println("True");
//	    }else
//	    {
//	        System.out.println("False");
//	    }
	 
    //Checkbox
	    List <WebElement> oCheckBox= ffdriver.findElements(By.xpath("//input[starts-with(@id,'checkbox')]"));
		//number of checkboxes
	    System.out.println(oCheckBox.size());
	    
	    for(int i=0; i < oCheckBox.size() ; i++ ){
	    	 // Store the checkbox name to the string variable, using 'Value' attribute
		     String sValue = oCheckBox.get(i).getAttribute("Value");
		     boolean b = oCheckBox.get(0).isSelected();
		     boolean b1 = oCheckBox.get(1).isSelected();
		     boolean b2 = oCheckBox.get(2).isSelected();
		    
		   	 // Select the checkbox it the value of the checkbox is same what you are looking for
		     if (sValue.equalsIgnoreCase("Cricket")){
		    	 oCheckBox.get(i).click();
		    	 break;
		    	 }
	    }
	
		Thread.sleep(5000);
		
		
	}

}
