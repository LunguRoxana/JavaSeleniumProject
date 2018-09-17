package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {
    public void navigatetoprofile(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.massdrop.com/my-communities");
        ((ChromeDriver) driver).findElementByClassName("avatar user__avatar my_community__user_avatar").click();

    }
}
