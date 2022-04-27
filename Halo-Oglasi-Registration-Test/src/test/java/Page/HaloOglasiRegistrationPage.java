package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistrationPage extends HaloOglasiBaseTest {
    public HaloOglasiRegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()=\"Fizičkog lica\"]")
    WebElement fizickoLiceRadioButton;

    public HaloOglasiRegistrationPage fizickoLiceCheckBox() {
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceRadioButton));
        if (!fizickoLiceRadioButton.isSelected()){
            fizickoLiceRadioButton.click();

        }
        return this;
    }
    @FindBy(id = "UserName")
    WebElement imeInputField;

    public HaloOglasiRegistrationPage imeInputFieldSendKeys(String ime) {
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField));
        imeInputField.clear();
        imeInputField.sendKeys(ime);
        return this;
    }

    @FindBy(id = "Email")
    WebElement emailInputField;

    public HaloOglasiRegistrationPage emailInputFieldSendKeys(String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);
        return this;
    }

    @FindBy(id = "Password")
    WebElement lozinkaInputField;

    public HaloOglasiRegistrationPage lozinkaInputFieldSendKeys(String lozinka) {
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(lozinka);
        return this;
    }

    @FindBy(id = "ConfirmPassword")
    WebElement ponoviLozinkuInputField;

    public HaloOglasiRegistrationPage ponoviLozinkuInputFieldSendKeys(String lozinka) {
        wdWait.until(ExpectedConditions.visibilityOf(ponoviLozinkuInputField)).clear();
        ponoviLozinkuInputField.sendKeys(lozinka);
        return this;
    }
    @FindBy(css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrujMeButton;

    public HaloOglasiRegistrationPage registrujMeButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMeButton)).click();
        return this;
    }
    @FindBy(id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostCheckBox;
    public HaloOglasiRegistrationPage saglasnostCheckBox(){
        wdWait.until(ExpectedConditions.elementToBeClickable(saglasnostCheckBox)).click();
        return this;
    }
}
