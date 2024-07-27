import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class Vtoroy {
    public Vtoroy() {
        super();

    }

    WebDriver driver = new ChromeDriver();

    public void openAcademy() {
        driver.get("https://htmlacademy.ru/");
    }

    public void openExite() {
        WebElement element = driver.findElement(By.cssSelector("a[href='https://htmlacademy.ru/login']"));
        element.click();


    }

    public void logout() {
        WebElement email = driver.findElement(By.id("login-email"));
        email.sendKeys("testt@gmail.com");
        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("test1998");
        WebElement button = driver.findElement(By.id("login-submit-button"));
        button.click();
    }

    public void education() {
        WebElement content = driver.findElement(By.className("header"));
        assertTrue(content.isDisplayed(), "Юзер Зашел");
    }

    @AfterTest
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}