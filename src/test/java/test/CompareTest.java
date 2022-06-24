package test;

import driver.BaseTest;
import org.junit.Test;
import page.ComparePricePage;

public class CompareTest extends BaseTest {

    @Test

    public void CompareTest(){

        ComparePricePage comparePricePage=new ComparePricePage();

        comparePricePage.compare();
        comparePricePage.increaseNumber();

    }
}
