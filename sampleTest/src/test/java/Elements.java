import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Elements {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void elementsTest() {   // looking 4 element
        driver.get("https://www.google.com/");
       // driver.findElement(By.id("fsettl")).click();
        driver.findElement(By.xpath("*[@id='fsettl']"));

        driver.navigate().refresh();
        driver.findElement(By.id("fsettl")).click();
        driver.switchTo().alert().dismiss();   // accepting of alert when deleting contact

    }


    @AfterClass()
    public void tearDown() {
        driver.quit();
    }
}
