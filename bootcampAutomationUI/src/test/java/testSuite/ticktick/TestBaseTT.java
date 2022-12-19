package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.loginPage;
import page.ticktick.mainLoginPage;
import page.ticktick.mainPage;
import session.Session;
import util.GetProperties;

public class TestBaseTT {

    mainLoginPage mainloginpage = new mainLoginPage();

    loginPage loginpage = new loginPage();

    mainPage mainpage = new mainPage();

    String mail = GetProperties.getInstance().getMail();

    String pwd = GetProperties.getInstance().getPwd();

    String listN = GetProperties.getInstance().getListN();

    String editN = GetProperties.getInstance().getEditN();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
