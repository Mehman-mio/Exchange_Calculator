package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DecimalFormat;

public class RepresentsLoss {
    private WebDriver driver;

    public RepresentsLoss(WebDriver driver) {
        this.driver = driver;
    }

    double ourCompanyAmount, swedBankAmount, correctLoss;
    String actualLoss, expectedLoss;

    @FindBy(xpath = "//tbody") WebElement table; //this locator for representing table
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span/span/span") WebElement ourCompanyAmountValue;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span/span/span") WebElement swedBankAmountValue;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span/span/span/following-sibling::span") WebElement lossValue;

    public void initValues() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(table)); //this condition for waiting loading table
        ourCompanyAmount = Double.parseDouble(ourCompanyAmountValue.getText());
        swedBankAmount = Double.parseDouble(swedBankAmountValue.getText());
    }
    public boolean checkLossIsDisplayed() {
        if (swedBankAmount < ourCompanyAmount && lossValue.isDisplayed()) {
            System.out.println("Loss is " + lossValue.getText());
            return true;
        } else {
            System.out.println("Loss is not displayed");
            return false;
        }
    }
    public String getExpectedLossValue(){
        correctLoss = swedBankAmount - ourCompanyAmount;
        String formattedCorrectLoss = new DecimalFormat("#0.00").format(correctLoss).replaceAll(",",".");
        expectedLoss = "(" + formattedCorrectLoss + ")";
        return expectedLoss;
    }
    public String getActualLossValue(){
        actualLoss = lossValue.getText();
        return actualLoss;
    }
}