package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class PersonalCabinet extends BaseForm {
    private Label user=new Label(By.xpath("//a[contains(text(),'Alexandr0390')]"), "User");

    public PersonalCabinet() {
        super(By.id("userbar"), "Page with regestration");
    }

    public  void checkLogin(String username){
        assertEquals(user.getText(),username);
    }

}
