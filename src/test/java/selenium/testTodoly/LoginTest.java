package selenium.testTodoly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ExamenFilaA.ejercicio3.pagesTodoLy.LoginSection;
import ExamenFilaA.ejercicio3.pagesTodoLy.MainPage;
import ExamenFilaA.ejercicio3.pagesTodoLy.MenuSection;
import ExamenFilaA.ejercicio3.session.Session;

public class LoginTest {

    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @Test
    public void loginTesting(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("katurdininea02@gmail.com");
        loginSection.passwordTextBox.setText("kat123");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo iniciar sesion");
    }
}
