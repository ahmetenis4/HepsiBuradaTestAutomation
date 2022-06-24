package page;

import methods.MethodsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import log4j.Log4j;

import java.lang.reflect.Method;

public class ClearToProductPage {

    MethodsPage methodsPage;
    Logger logger = LogManager.getLogger(ClearToProductPage.class);

    public ClearToProductPage(){

        methodsPage=new MethodsPage();

    }       public void clearProduct(){

        methodsPage.scrollWithAction(By.cssSelector("a[class='delete_product_3DFC0']"));
        methodsPage.click(By.cssSelector("a[class='delete_product_3DFC0']"));
        methodsPage.waitBysecond(2);
        methodsPage.assertions(By.cssSelector("div[class='content_Z9h8v']"));
        Log4j.info("Ürün Boş Kontrolü Yapıldı");
    }
}
