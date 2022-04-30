package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import functionalities.SellBuyBoxes;
import prePostConditions.BaseTest;

public class SellBuyAmountBoxTests extends BaseTest {

    @Test(priority = 1)
    public void inputDataInBuyFieldTest() {
        SellBuyBoxes sellBuyBoxes = PageFactory.initElements(driver, SellBuyBoxes.class);
        sellBuyBoxes.inputBuyAmount();
        Assert.assertEquals(sellBuyBoxes.checkSellFieldIsEmpty(), true);
    }
    @Test(priority = 2)
    public void inputDataInSellFieldTest() {
        SellBuyBoxes sellBuyBoxes = PageFactory.initElements(driver, SellBuyBoxes.class);
        sellBuyBoxes.inputSellAmount();
        Assert.assertEquals(sellBuyBoxes.checkBuyFieldIsEmpty(), true);
    }
}