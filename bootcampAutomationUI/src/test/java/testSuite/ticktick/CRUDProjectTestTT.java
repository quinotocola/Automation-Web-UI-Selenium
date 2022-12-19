package testSuite.ticktick;

import org.junit.jupiter.api.Test;

public class CRUDProjectTestTT extends TestBaseTT{

    @Test
    public void verifyTest() throws InterruptedException {

        mainloginpage.signIn.click();
        loginpage.mailOrPhone.setText(mail);
        loginpage.password.setText(pwd);
        loginpage.signIn2.click();
        mainpage.addList.click();
        mainpage.listName.setText(listN);
        mainpage.save.click();
        Thread.sleep(5000);
        mainpage.moreFolder.click();
        mainpage.edit.click();
        mainpage.editName.setText(editN);
        mainpage.save.click();
        Thread.sleep(5000);
        mainpage.moreFolder.click();
        mainpage.delete.click();
        mainpage.deleteConfir.click();
        Thread.sleep(5000);

    }
}
