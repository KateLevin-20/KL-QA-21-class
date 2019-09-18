import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiSearch extends TestBase {

    @Test
    public void wikiSearch() {
        app.getLogin().type(By.name("search"), "java");

        app.getLogin().click(By.name("go"));
    }
}
