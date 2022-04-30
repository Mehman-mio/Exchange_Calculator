package tests;

import functionalities.Localization;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import prePostConditions.BaseTest;

public class LocalizationTests extends BaseTest {
    String expectedCurrencyTypeEur = "EUR"; //Lithuania,Latvia,Estonia,Spain,Germany,Kosovo,France
    String expectedCurrencyTypeBgn = "BGN"; //Bulgaria
    String expectedCurrencyTypeRon = "RON"; //Romania
    String expectedCurrencyTypePln = "PLN"; //Poland
    String expectedCurrencyTypeGbp = "GBP"; //United Kingdom
    String expectedCurrencyTypeRub = "RUB"; //Russia
    String expectedCurrencyTypeDzd = "DZD"; //Algeria
    String expectedCurrencyTypeAll = "ALL"; //Albania
    String expectedCurrencyTypeUah = "UAH"; //Ukraine

    @Test(priority = 1)
    public void currencyTypeLithuaniaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryLithuania();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 2)
    public void currencyTypeLatviaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryLatvia();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 3)
    public void currencyTypeEstoniaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryEstonia();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 4)
    public void currencyTypeBulgariaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryBulgaria();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeBgn);
    }
    @Test(priority = 5)
    public void currencyTypeSpainTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountrySpain();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 6)
    public void currencyTypeRomaniaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryRomania();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeRon);
    }
    @Test(priority = 7)
    public void currencyTypePolandTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryPoland();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypePln);
    }
    @Test(priority = 8)
    public void currencyTypeUnitedKingdomTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryUk();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeGbp);
    }
    @Test(priority = 9)
    public void currencyTypeGermanyTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryGermany();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 10)
    public void currencyTypeRussiaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryRussia();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeRub);
    }
    @Test(priority = 11)
    public void currencyTypeAlgeriaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryAlgeria();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeDzd);
    }
    @Test(priority = 12)
    public void currencyTypeAlbaniaTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryAlbania();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeAll);
    }
    @Test(priority = 13)
    public void currencyTypeKosovoTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryKosovo();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
    @Test(priority = 14)
    public void currencyTypeUkraineTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryUkraine();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeUah);
    }
    @Test(priority = 15)
    public void currencyTypeFranceTest(){
        Localization localization = PageFactory.initElements(driver, Localization.class);
        localization.clickLocalizationButton();
        localization.clickCountriesDropdown();
        localization.selectCountryFrance();
        Assert.assertEquals(localization.checkCurrencyType(), expectedCurrencyTypeEur);
    }
}