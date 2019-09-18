import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiLoginHw extends TestBase {

    @Test
    public void loginTest() {
        app.getLogin().click(By.id("pt-login"));
        app.getLogin().type(By.id("wpName1"), "mamama@test.com");
        app.getLogin().type(By.id("wpPassword1"), "qwert123");

        Assert.assertTrue(app.getLogin().isElementPresent(By.cssSelector("[id='pt-anonuserpage']")));


    }

}




