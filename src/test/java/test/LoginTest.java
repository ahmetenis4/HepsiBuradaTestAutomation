package test;

import driver.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;
import log4j.Log4j;

public class LoginTest extends BaseTest {

    @Test

    public void LoginTest(){

        LoginPage loginPage=new LoginPage();

        loginPage.login();

    }

}
