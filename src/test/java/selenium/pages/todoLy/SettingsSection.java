package ExamenFilaA.ejercicio3.pages.todoLy;

import ExamenFilaA.ejercicio3.controls.Button;
import ExamenFilaA.ejercicio3.controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {

    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));

}
