package advancedPOC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDragAndDrop {
	
	
	@Test
	public  void myDragDrop() throws InterruptedException {
		  
		  WebDriver driver = new FirefoxDriver();
		  System.out.println("Launching Browser");
		  //Opening the URL
		  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		  //Implicit wait for the browser to launch
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //Identifying the elements to perform action 
		  Thread.sleep(4000);
		  WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		  WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		  Actions myAction = new Actions(driver);
		  //Performing Drag and Drop operation 
		  myAction.dragAndDrop(draggable, droppable).perform();
		  System.out.println("Successfully completed the Drag-Drop operation");
		 }

}
