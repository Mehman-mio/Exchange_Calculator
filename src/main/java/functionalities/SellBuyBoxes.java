package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellBuyBoxes {
    private WebDriver driver;

    public SellBuyBoxes(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//tbody") WebElement table;
    @FindBy(xpath = "//label[text()='Sell']/following-sibling::input") WebElement sellAmountBox;
    @FindBy(xpath = "//label[text()='Buy']/following-sibling::input") WebElement buyAmountBox;

    public void inputBuyAmount(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(table));
        buyAmountBox.sendKeys("200");
    }
    public void inputSellAmount(){
        sellAmountBox.sendKeys("300");
    }
    public boolean checkSellFieldIsEmpty(){
        String text = sellAmountBox.getAttribute("value");
        if(text.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkBuyFieldIsEmpty(){
        String text = buyAmountBox.getAttribute("value");
        if(text.isEmpty()){
            return true;
        }
        return false;
    }
}