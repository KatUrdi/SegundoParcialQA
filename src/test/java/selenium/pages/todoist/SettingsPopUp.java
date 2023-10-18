package selenium.pages.todoist;

import org.openqa.selenium.By;
import selenium.controls.Button;

public class SettingsPopUp {

    public Button changePasswordButton = new Button(By.xpath("//a[@href='/app/settings/account/password']"));
    public Button exitSettingsButton = new Button(By.xpath("//button[contains(@aria-label, 'Cerrar config')]"));



}
