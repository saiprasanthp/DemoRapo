package Amazon;

import org.testng.annotations.Test;

public class AmazonTestClass extends BaseClass {
	
	AmazonTestClass(){
		super();
	}
	
	@Test
	public void testing() {
		AmazonPage page=new AmazonPage(driver);
		Mens men=page.click_on_Fashion();
		
	}
	
	
	

}
