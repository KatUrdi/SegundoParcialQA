package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//li//a[@href=\"/auth/login\"]"));
}
