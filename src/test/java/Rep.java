import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rep {

    WebDriver webDriver;
    @Test
    public void startChrome(){
        webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com/intl/ru/chrome/");
    }

}
