package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class loginPage {

    public TextBox mailOrPhone = new TextBox(By.id("emailOrPhone"));

    public TextBox password = new TextBox(By.id("password"));

    public Button signIn2 = new Button(By.xpath("//button[text()='Sign In']"));

    public void login (String mail, String pwd){
        mailOrPhone.setText(mail);
        password.setText(pwd);
        signIn2.click();
    }
}
