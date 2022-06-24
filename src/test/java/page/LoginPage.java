package page;

import methods.MethodsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import log4j.Log4j;

public class LoginPage {

    MethodsPage methodsPage;


    public LoginPage() {

        methodsPage = new MethodsPage();

    }

    public void login() {

        methodsPage.assertions(By.id("shoppingCart"));
        methodsPage.waitBysecond(2);
        methodsPage.sendKeys(By.xpath("//input[@class='desktopOldAutosuggestTheme-input']"), "ayakkabı");
        methodsPage.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-input']")).sendKeys(Keys.RETURN);
        methodsPage.waitBysecond(2);

        Log4j.info("entere tuşu ile diğer sayfaya giriş yapıldı");


    }
}
