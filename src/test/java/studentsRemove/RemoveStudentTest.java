package studentsRemove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class RemoveStudentTest {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        driver = new ChromeDriver();
    }
    @Test
    public void testMethod() {
        driver.get("http://151.80.70.42:3000");
        driver.findElement(By.className("secondary-content")).click();




//        List<WebElement> elements = driver.findElements(By.id("user-list"));
//        for (WebElement el: elements) {
//            Assert.assertTrue(el.getText().contains("Pavlik"));
//        }

    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}
