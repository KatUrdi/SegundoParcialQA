package ExamenFilaA.ejercicio3.pages.todoist;

import ExamenFilaA.ejercicio3.controls.Button;
import org.openqa.selenium.By;

public class MainTodoistPage {

    public Button loginButton = new Button(By.xpath("//li//a[contains(text(), 'Iniciar')]"));

}
