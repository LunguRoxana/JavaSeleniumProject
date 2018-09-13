package somePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

public class LoginButton{
    private final WebDriver driver;
    public LoginButton(WebDriver driver){
        this.driver = driver;
    }
    public void LoginButton(){
        driver.get("https://www.massdrop.com/my-communities");
        driver.findElement(By.className("splash__sign_in_button button button--small button--transparent button--solid")).submit();

    }


}