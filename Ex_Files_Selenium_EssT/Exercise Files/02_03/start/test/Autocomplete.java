import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("13023 148th street Jamaica NY 11436");

        Thread.sleep(1000);
        WebElement addressNotFoundOKButton = driver.findElement(By.className("dismissButton"));
        addressNotFoundOKButton.click();

        driver.quit();
    }
}
