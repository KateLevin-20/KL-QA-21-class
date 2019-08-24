import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiLoginHw extends TestBase
{
@Test
    public void loginTest() throws InterruptedException {
    driver.get("https://en.wikipedia.org");
    click(By.id("pt-login"));

    click(By.id("wpName1"));
    driver.findElement(By.id("wpName1")).clear();
    driver.findElement(By.id("wpName1")).sendKeys("mamama@test.com");

    click(By.id("wpPassword1"));
    driver.findElement(By.id("wpPassword1")).clear();
    driver.findElement(By.id("wpPassword1")).sendKeys("qwert123");

    Thread.sleep(7000);

}

    public void click(By locator) {
        driver.findElement(locator).click();
    }


{

}
}
