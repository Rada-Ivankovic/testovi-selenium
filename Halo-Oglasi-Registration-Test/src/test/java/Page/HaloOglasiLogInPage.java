package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLogInPage extends HaloOglasiBaseTest {
    public HaloOglasiLogInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Registrujte se")
    WebElement registrujSeLink;

    public HaloOglasiLogInPage registrujSeLinkClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeLink)).click();
        return this;
    }
    @FindBy(id = "EMailOrUsername")
    WebElement imeInputField;

    public HaloOglasiLogInPage imeInputFieldSendKeys(String ime) {
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField));
        imeInputField.clear();
        imeInputField.sendKeys(ime);
        return this;
    }

    @FindBy(id = "Password")
    WebElement lozinkaInputField;

    public HaloOglasiLogInPage lozinkaInputFieldSendKeys(String lozinka) {
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(lozinka);
        return this;
    }
    //@FindBy(css = ".login-button")
    @FindBy(css = ".btn-main.login-button.login-user")
    WebElement ulogujMeButton;

    public HaloOglasiLogInPage ulogujMeButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujMeButton)).click();
        return this;
    }
}
