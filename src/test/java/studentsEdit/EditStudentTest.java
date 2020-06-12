package studentsEdit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class EditStudentTest {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {

        driver = new ChromeDriver();
    }
    @Test
    public void testMethod() {

        List<WebElement> elements = driver.findElements(By.cssSelector("div.list"));
        for (WebElement el: elements) {
            Assert.assertTrue(el.getText().toLowerCase().contains("bot"));
        }


        driver.get("http://151.80.70.42:3000");

       driver.findElement(By.id("43")).click();
       driver.findElement(By.cssSelector(".waves-effect:nth-child(4)")).click();
       driver.findElement(By.xpath("//ul[@id='user-list']/li[4]")).click();
        driver.findElement(By.id("icon_prefix")).clear();
        driver.findElement(By.id("icon_prefix")).sendKeys("ololololo");
        driver.findElement(By.id("icon_telephone")).clear();
        driver.findElement(By.id("icon_telephone")).sendKeys("5000");
        driver.findElement(By.className("mdi-file-cloud")).click();

    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}
