package selenium.pagesTodoist;

import selenium.control.Button;
import selenium.control.TextBox;
import org.openqa.selenium.By;

public class ProfilePopUp {
    public Button settingsButton = new Button(By.xpath("//span[@class='user_menu_label' and text()='Settings']"));
    public Button logoutButton = new Button(By.xpath("//span[text()='Log out']"));
}
