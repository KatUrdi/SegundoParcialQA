package selenium.pages.todoist;

import selenium.controls.Button;
import selenium.controls.Label;
import org.openqa.selenium.By;

public class LateralProjectSection {

    public Label projectSectionLabel = new Label(By.xpath("//a[@href='/app/projects']"));
    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='A\u00f1adir proyecto']"));


}
