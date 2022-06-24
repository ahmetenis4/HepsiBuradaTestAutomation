package page;

import methods.MethodsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import log4j.Log4j;
import java.util.List;

public class ProductPage {
    MethodsPage methodsPage;
    Logger logger=LogManager.getLogger(LoginPage.class);
    public ProductPage(){

        methodsPage=new MethodsPage();
    }

    public void products(){

        methodsPage.scrollWithMoreDown();
        Log4j.info("Scroll edildi");

        methodsPage.waitBysecond(3);
        methodsPage.randomSelect(By.xpath("//li[@class='productListContent-item']"));
        Log4j.info("Random Ürün Seçildi");

        methodsPage.waitBysecond(3);
        methodsPage.goToAnotherPage();
        methodsPage.waitBysecond(3);
        methodsPage.click(By.xpath("//button[@class='button big with-icon']"));
        methodsPage.waitBysecond(4);

    }
}
