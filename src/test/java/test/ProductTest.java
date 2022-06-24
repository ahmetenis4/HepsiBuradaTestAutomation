package test;

import driver.BaseTest;
import org.junit.Test;
import page.ProductPage;

public class ProductTest extends BaseTest {
    @Test

    public void ProductTest(){

        ProductPage productPage=new ProductPage();
        productPage.products();
    }
}
