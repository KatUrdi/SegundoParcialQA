package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;
import selenium.control.TextBox;
public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.id("element-0"));
    public TextBox passwordTextBox = new TextBox(By.id("element-3"));
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"));
}
