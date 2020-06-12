package studentsRemove;

import net.bytebuddy.matcher.ElementMatcher;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RemoveStudentTest {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        driver = new ChromeDriver();
    }
    @Test
    public void testMethod() {
        driver.get("http://151.80.70.42:3000");

       // Не могу понять почему не нажимается крестик и\или не выбирается студент

//        driver.findElement(By.className("remove mdi-action-highlight-remove")).click();
//        driver.findElement(By.cssSelector(".mdi-action-highlight-remove:before")).click();
//        driver.findElement(By.cssSelector(".waves-effect:nth-child(5) .remove")).click();
        driver.findElement(By.cssSelector(".waves-effect:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".active .remove")).click();








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
