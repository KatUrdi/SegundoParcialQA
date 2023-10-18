package selenium.pages.todoLy;

import selenium.controls.Button;
import selenium.controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {

    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));

}
