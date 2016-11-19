package demo.test;

import demo.test.forms.Onliner;
import demo.test.forms.PageRegestration;
import demo.test.forms.PersonalCabinet;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import webdriver.BaseTest;

import java.io.IOException;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class OnlinerTest extends BaseTest {
    private String setPas;
    private String setUser;

    @Parameters({"username", "pass"})
    @BeforeTest
    public void Parameters(String setUser, String setPas) {
        this.setPas = setPas;
        this.setUser=setUser;
    }


    public void runTest() throws IOException {
        logger.step(1);
        Onliner onliner = new Onliner();
        onliner.enterRegestration();
        browser.maximize();
        logger.step(2);
        PageRegestration pageRegestration = new PageRegestration();
        pageRegestration.enterUser(setUser);
        pageRegestration.enterPass(setPas);
        pageRegestration.enterEmailPass();
        logger.step(3);
        PersonalCabinet personalCabinet= new PersonalCabinet();
        personalCabinet.checkLogin(setUser);



    }
}
