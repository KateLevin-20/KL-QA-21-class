import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WikiLoginHw extends TestBase {

    Logger logger = LoggerFactory.getLogger(WikiLoginHw.class);

    @BeforeMethod
    public void startLogger(){
        logger.info("Start wiki login test");
    }

    @AfterMethod
    public void stopLogger(){
        logger.info("Stop wiki login test");
    }

    @Test
    public void loginTest() {
        app.getLogin().click(By.id("pt-login"));
        app.getLogin().type(By.id("wpName1"), "mamama@test.com");
        app.getLogin().type(By.id("wpPassword1"), "qwert123");

        Assert.assertTrue(app.getLogin().isElementPresent(By.cssSelector("[id='pt-anonuserpage']")));


    }

}




