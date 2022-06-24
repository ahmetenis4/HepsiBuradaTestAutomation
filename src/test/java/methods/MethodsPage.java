package methods;

import driver.BaseTest;
import org.apache.commons.exec.util.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MethodsPage {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public MethodsPage() {

        driver = BaseTest.driver;
        driver = BaseTest.driver;

        wait = new FluentWait<WebDriver>(driver);

        //3 sn ile tekrarlı şekilde elementi arasın ,30 sn içinde bulamassa fail versin.
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public void click(By by) {
        findElement(by).click();
    }

    public void waitBysecond(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //sayfada görünüyormu,varmı, methodumuz.

    public boolean isElementVisible(By by) {

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));

            return true;

        } catch (Exception e) {
            return false;
        }


    }

    public void sendKeys(By by, String text) {

        findElement(by).sendKeys(text);


    }

    //mause ve klavyenin yaptığı işler.
    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();


    }

    public void scrollWithMoreDown() {

        JavascriptExecutor js = (JavascriptExecutor) jsdriver;
        js.executeScript("window.scrollBy(0,2000)", "");

    }


    public List<WebElement> findElements(By by) {
        return driver.findElements(by);


    }

    public List<WebElement> findAll(By by) {
        return driver.findElements(by);

    }

    public void randomSelect(By by) { //random seçme
        Random rand = new Random();
        findAll(by).get(rand.nextInt(findAll(by).size())).click();

    }

    public void assertions(By by) {
        try {
            Assert.assertTrue(isElementVisible(by));
            System.out.println("sıkıntı yok");
        } catch (Exception e) {
            System.out.println("sıkıntıllı");
        }


    }


    public void goToAnotherPage() {

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String ChildWindow : allWindowHandles) {
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }

        }


    }

    public String gettext(By by) {

        String heading = driver.findElement(by).getText();


        return heading;


    }

    //js ile value alma virgülden sonrasını silmeye yardımcı
    public String getValue(By by) {

        return jsdriver.executeScript("return arguments[0].value", findElement(by)).toString();

    }

}