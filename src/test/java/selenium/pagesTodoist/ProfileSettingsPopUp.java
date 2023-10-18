package selenium.pagesTodoist;

import selenium.control.Button;
import selenium.control.TextBox;
import org.openqa.selenium.By;

public class ProfileSettingsPopUp {
    public Button changePasswordButton = new Button(By.xpath("//a[@class='_8313bd46 _54d56775 _5e45d59f _2a3b75a1 _56a651f6' and @href='/app/settings/account/password']"));


    public Button closeButton = new Button(By.xpath("//button[@aria-label='Close settings']"));
}
