import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        Thread.sleep(1000);

        WebElement radioButtonItem = driver.findElement(By.xpath("//a[contains(text(),'Radio')]"));
        //radioButtonItem.click();

       // WebElement autocompleteButton = driver.findElement(By.id("autocomplete"));
      //  autocompleteButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonItem);

        Thread.sleep(1000);


        driver.quit();
    }
}
