package tests;

import functionalities.RepresentsLoss;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import prePostConditions.BaseTest;

public class RepresentsLossTests extends BaseTest {

    @Test(priority = 1)
    public void lossIsDisplayedTest(){
        RepresentsLoss representsLoss = PageFactory.initElements(driver, RepresentsLoss.class);
        representsLoss.initValues();
        Assert.assertEquals(representsLoss.checkLossIsDisplayed(), true);
    }
    @Test(priority = 2)
    public void checkIsLossCorrect(){
        RepresentsLoss representsLoss = PageFactory.initElements(driver, RepresentsLoss.class);
        representsLoss.initValues();
        Assert.assertEquals(representsLoss.getActualLossValue(),representsLoss.getExpectedLossValue());
    }
}