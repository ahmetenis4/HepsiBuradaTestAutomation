package page;

import methods.MethodsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import log4j.Log4j;
public class ComparePricePage {
    MethodsPage methodsPage;

    public ComparePricePage() {
        methodsPage = new MethodsPage();

    }


    public void compare() {

        String price2 = methodsPage.gettext(By.id("offering-price"));
        String cleanPrice = price2.substring(0, price2.length() - 3);
        cleanPrice = cleanPrice.replace(".", "");
        cleanPrice = cleanPrice.replace(",", "");
        int intPrice = Integer.parseInt(cleanPrice);
        System.out.println(intPrice);

        methodsPage.waitBysecond(3);
        methodsPage.click(By.cssSelector("a[class='sf-OldMyAccount-MjrNQp_LLdAaN1g0xvSz sf-OldMyAccount-VcxldoRSjUmlWBLJaTly']"));

        methodsPage.waitBysecond(4);

        String price1 = methodsPage.gettext(By.id("basket_payedPrice"));
        String cleanPrice1 = price1.substring(0, price1.length() - 3);
        cleanPrice1 = cleanPrice1.replace(".", "");
        cleanPrice1 = cleanPrice1.replace(",", "");
        int intPrice1 = Integer.parseInt(cleanPrice);
        System.out.println(intPrice1);


        if (intPrice == intPrice1) {
            System.out.println(intPrice + "=" + intPrice1);
        } else {

            System.out.println(intPrice + "!=" + intPrice1);


        }       Log4j.info("Ürün Fiyatı ile Sepetteki Fiyat Karşılaştırıldı");

    }

    public void increaseNumber() {

        methodsPage.click(By.xpath("//a[@class='product_increase_3SpEx']"));

        methodsPage.waitBysecond(2);

        String value = methodsPage.getValue(By.cssSelector("input[name='quantity']"));
        Assert.assertEquals("2", value);

        System.out.println("beklenen sonuc=" + value);

        Log4j.info("Ürün Adeti Arttırıldı");


    }



}
