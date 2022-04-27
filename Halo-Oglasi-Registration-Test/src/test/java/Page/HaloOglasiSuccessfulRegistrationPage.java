package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class HaloOglasiSuccessfulRegistrationPage extends HaloOglasiBaseTest {
    public HaloOglasiSuccessfulRegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(className="regsitration-success")
    //@FindBy(xpath = "//span[text()=\"Registracija je uspela!\"]")
    WebElement uspelaRegistracija;

    public boolean uspelaRegistracijaMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(uspelaRegistracija));
        return uspelaRegistracija.isDisplayed();
    }

    public String uspelaRegistracijaMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(uspelaRegistracija));
        return uspelaRegistracija.getText();
    }
    @FindBy(linkText = "Prijava")
    WebElement prijavaLink;
    public HaloOglasiSuccessfulRegistrationPage prijavaLinkClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(prijavaLink)).click();
        return this;
    }
    public HaloOglasiSuccessfulRegistrationPage switchToNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> numbersOfTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(numbersOfTabs.get(1));
        return this;

    }
}
