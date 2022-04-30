package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Localization {
    private WebDriver driver;

    public Localization(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//tbody") WebElement table;
    @FindBy(xpath = "//span[@class='js-localization-popover']") WebElement localizationButton;
    @FindBy(xpath = "//button[@id='countries-dropdown']") WebElement countriesDropdown;
    @FindBy(xpath = "//button[@class='customize-button btn btn-primary']")WebElement cookiesButton;
    @FindBy(xpath = "//label[text()='Sell']/following-sibling::input/following-sibling::div/descendant::div[@class='ui-select-match csp ng-scope']/span") WebElement currencyBox;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-lt']") WebElement countryLithuania;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-lv']") WebElement countryLatvia;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-ee']") WebElement countryEstonia;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-bg']") WebElement countryBulgaria;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-es']") WebElement countrySpain;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-ro']") WebElement countryRomania;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-pl']") WebElement countryPoland;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-gb']") WebElement countryUk;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-de']") WebElement countryGermany;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-ru']") WebElement countryRussia;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-dz']") WebElement countryAlgeria;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-al']") WebElement countryAlbania;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-xk']") WebElement countryKosovo;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-ua']") WebElement countryUkraine;
    @FindBy(xpath = "//a/span[@class='flag-icon-small flag-icon-fr']") WebElement countryFrance;

    public void clickLocalizationButton(){
        localizationButton.click();
    }
    public void clickCountriesDropdown(){
        countriesDropdown.click();
    }
    public void selectCountryLithuania(){
        countryLithuania.click();
    }
    public void selectCountryLatvia(){
        countryLatvia.click();
    }
    public void selectCountryEstonia(){
        countryEstonia.click();
    }
    public void selectCountryBulgaria(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        countryBulgaria.click();
        wait.until(ExpectedConditions.elementToBeClickable(cookiesButton)).click();//this method is for handling alert window about cookies
    }
    public void selectCountrySpain(){
        countrySpain.click();
    }
    public void selectCountryRomania(){
        countryRomania.click();
    }
    public void selectCountryPoland(){
        countryPoland.click();
    }
    public void selectCountryUk(){
        countryUk.click();
    }
    public void selectCountryGermany(){
        countryGermany.click();
    }
    public void selectCountryRussia(){
        countryRussia.click();
    }
    public void selectCountryAlgeria(){
        countryAlgeria.click();
    }
    public void selectCountryAlbania(){
        countryAlbania.click();
    }
    public void selectCountryKosovo(){
        countryKosovo.click();
    }
    public void selectCountryUkraine(){
        countryUkraine.click();
    }
    public void selectCountryFrance(){
        countryFrance.click();
    }
    public String checkCurrencyType(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(table));
        String currencyType = currencyBox.getText();
        return currencyType;
    }
}
