package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class mainPage {

    public Button addList = new Button(By.xpath("//*[name()='use' and @*='#list-add']"));

    public TextBox listName = new TextBox(By.id("edit-project-name"));

    public Button save = new Button(By.xpath("//button[text()='Save']"));

    public Button moreFolder = new Button(By.xpath("//ul[contains(@class, 'project-ul')]/div[contains(@class, 'project')]/li[contains(@class, 'project-list-view-item drop-hover-target h-[40px] px-[8px]')]/div[contains(@class, 'h-full')]/button/div[contains(@class, 'flex-none flex items-center min-w-[24px] justify-end relative z-0')]/div[contains(@class, 'peer w-[18px] h-[18px] absolute right-0 top-1/2 -translate-y-1/2 opacity-0 group-hover:opacity-100 group-focus-visible:opacity-100 focus-visible:opacity-100 focus:opacity-100')]//*[name()='use' and @*='#more-for-folder']"));

    public Button edit = new Button(By.xpath("//a[text()='Edit']"));

    public TextBox editName = new TextBox(By.id("edit-project-name"));

    public Button delete = new Button(By.xpath("//a[text()='Delete']"));

    public Button deleteConfir = new Button(By.xpath("//button[text()='Delete']"));

    public void addNewList(String listN, String editN){
        listName.setText(listN);
        editName.setText(editN);
        addList.click();
        save.click();
        moreFolder.click();
        edit.click();
        deleteConfir.click();
        delete.click();
    }
}
