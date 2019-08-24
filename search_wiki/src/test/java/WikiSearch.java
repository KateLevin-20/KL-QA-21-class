import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiSearch
{
    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
    }

    @Test
    public void wikiSearch() throws InterruptedException {
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");
        driver.findElement(By.name("go")).click();

        Thread.sleep(7000);

    }

    @AfterMethod
    public void tearDown() {
driver.quit();
    }
}
