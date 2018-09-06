import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openEbay();
    }

    @AfterMethod

    public void tearDown()
    {
    driver.quit();
    }

    protected void SubmitLogin() {
        driver.findElement(By.id("sgnBt")).click();
    }

    public void fillUserIdfield() {
        driver.findElement(By.name("userid")).click();
        driver.findElement(By.name("userid")).clear();
        driver.findElement(By.name("userid")).sendKeys("debotest19+1535362788620@gmail.com");

        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("aA123456789");



    }

    public void EbaySignIn() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    public void openEbay() {
        driver.get("https://www.ebay.com");
    }

    public void initNewUserRegistration() {
        driver.findElement(By.linkText("register")).click();
    }

    public void clickOnButtonSubmitRegistration() {
        driver.findElement(By.id("ppaFormSbtBtn")).click();
    }

    public void fillPasswordForm() {
        driver.findElement(By.name("PASSWORD")).click();
        driver.findElement(By.name("PASSWORD")).clear();
        driver.findElement(By.name("PASSWORD")).sendKeys("aA123456789");
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        String email = "debotest19+" + System.currentTimeMillis()+"@gmail.com";
        driver.findElement(By.id("email")).sendKeys(email);
        System.out.println(email);
    }

    public void fillLastNameForm() {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Edery");
    }

    public void fillFirstNameForm() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Debo");
    }
}
