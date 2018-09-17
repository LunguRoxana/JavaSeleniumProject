package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public String email;
    public String pass;

    public void dologin(){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.name("username")).sendKeys("bita_roxana@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("InvataC#");
        ((ChromeDriver) driver).findElementByClassName("button--large button--block button").submit();
    }
}

