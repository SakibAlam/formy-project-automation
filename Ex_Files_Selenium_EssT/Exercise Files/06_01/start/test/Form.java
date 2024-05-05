import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        Form

        submitForm(driver);

        waitForAlertBanner(driver);

        Assertions.assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

       driver.quit();
    }

    public static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".alert"))));

    }

    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }




}
