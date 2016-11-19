package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class Onliner extends BaseForm{
    private Button btnEnter = new Button(By.xpath("//div[contains(text(),'Вход')]"), "Open regestration");

    public Onliner() {
        super(By.id("userbar"), "Onliner by");
    }


    public void enterRegestration() {
        btnEnter.click();
        browser.waitForPageToLoad();


    }
}
