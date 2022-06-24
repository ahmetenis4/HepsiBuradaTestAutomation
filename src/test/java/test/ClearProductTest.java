package test;

import driver.BaseTest;
import org.junit.jupiter.api.Test;
import page.ClearToProductPage;

public class ClearProductTest extends BaseTest {

    @Test

    public void ClearProductTest(){
        ClearToProductPage clearToProductPage =new ClearToProductPage();
        clearToProductPage.clearProduct();

    }

}
