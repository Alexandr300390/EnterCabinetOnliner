package demo.test.forms;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import org.openqa.selenium.By;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class PageRegestration extends BaseForm {

    private TextBox txbUser = new TextBox(By.xpath("//input[@placeholder='Ник или e-mail']"));
    private TextBox txbPass = new TextBox(By.xpath("//input[@placeholder='Пароль']"));
    private Button btnEnter = new Button(By.xpath("//button[contains(text(), 'Войти')]"));

    public PageRegestration() {
        super(By.xpath("//div[@id='auth']//a[@href ='http://www.onliner.by']"), "Page with regestration");
    }

    public void enterUser(String setUser) {
        browser.waitForPageToLoad();
        txbUser.setText(setUser);

    }

    public void enterPass(String setPass) {
        browser.waitForPageToLoad();
        txbPass.setText(setPass);

    }

    public void enterEmailPass() {
        browser.waitForPageToLoad();
        btnEnter.click();

    }
}
