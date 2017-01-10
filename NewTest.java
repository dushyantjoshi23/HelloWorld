import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:/Users/IBM_ADMIN/Desktop/TADDM/Softwares/geckodriver-v0.11.1-win64/geckodriver.exe");
	  WebDriver wd = new FireFoxDriver();
	  wd.get("http://9.17.237.67:9080/SCOPEWEB");
	  System.out.println("Adding comt");
	  
  }
  
}
