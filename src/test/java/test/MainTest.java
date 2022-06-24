package test;

import driver.BaseTest;
import org.junit.Test;
import page.ClearToProductPage;
import page.ComparePricePage;
import page.LoginPage;
import page.ProductPage;

public class MainTest extends BaseTest {

    @Test

    public void MainTest(){

        LoginPage loginPage=new LoginPage();
        loginPage.login();

        ProductPage productPage=new ProductPage();
        productPage.products();

        ComparePricePage comparePricePage=new ComparePricePage();
        comparePricePage.compare();
        comparePricePage.increaseNumber();

        ClearToProductPage clearToProductPage =new ClearToProductPage();
        clearToProductPage.clearProduct();

    }


}
