import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayTest
{

    ChromeDriver driver;
 @Test
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com");
        
        driver.quit();
    }
}
