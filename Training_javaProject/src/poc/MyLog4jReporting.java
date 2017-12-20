package poc;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class MyLog4jReporting {
	
	private static Logger log = Logger.getLogger(MyLog4jReporting.class.getName());
	
	@Test
	public void testLog4j(){
		
		log.info("my log4j log statement: Radical");
		
		
	}

}
