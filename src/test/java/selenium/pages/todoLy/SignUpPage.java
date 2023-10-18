package selenium.pages.todoLy;

import org.openqa.selenium.By;
import selenium.controls.Button;
import selenium.controls.TextBox;


public class SignUpPage {

    public TextBox fullNameTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button acceptTermsButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));

    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}
