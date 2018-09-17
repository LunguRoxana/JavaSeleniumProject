package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class EntryPage {
    public void navtologin(){
        WebDriver driver = new ChromeDriver();
        //vom efectua login
        driver.get("https://www.massdrop.com/?origin=%2Fmy-communities");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((ChromeDriver) driver).findElementByClassName("splash__sign_in_button button button--small button--transparent button--solid").click();

    }
}
