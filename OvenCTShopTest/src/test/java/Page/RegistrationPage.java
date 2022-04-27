package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BaseTest {
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    WebElement imeInputField;
    @FindBy(id = "lastname")
    WebElement prezimeInputField;
    @FindBy(id = "email_address")
    WebElement emailInputField;
    @FindBy(id = "is_subscribed")
    WebElement newsLetterCheckBox;
    @FindBy(id = "pravnolice")
    WebElement pravnoLiceDropdown;
    @FindBy(id = "firma")
    WebElement firmaInputField;
    @FindBy(id = "pib")
    WebElement pibInputField;
    @FindBy(id = "password")
    WebElement lozinkaInputField;
    @FindBy(id = "confirmation")
    WebElement potvrdaLozinkeInputField;
    @FindBy(className = "ub-emb-close")
    WebElement reklamaButton;
    @FindBy(xpath = "//button[text()='Prihvatam']")
    WebElement prihvatamButton;
    @FindBy(xpath = "//span[text() ='Pošalji']")
    WebElement posaljiButton;
    @FindBy(css = ".alert-warning")
    WebElement wrongEmailRegistrationMesage;
    //@FindAll({
    //@FindBy(css = ".alert.alert-succes")
    //})public List<WebElement> successfulRegistration;
    /*@FindAll({
            @FindBy(css = ".alert.alert-warning")
    })public List<WebElement> neuspesnaRegistracija;
    */
    @FindBy(css = ".ub-emb-close")
    WebElement reklama2XButton;
    @FindBy(css = ".alert-warning")
    WebElement nevalidanPibMessage;
    @FindBy(css = ".alert-warning")
    WebElement firmaInputFieldEmptyMessage;
    @FindBy(css = ".alert-warning")
    WebElement razliciteSifreMessage;
    @FindBy(css = ".am-opener")
    WebElement sviProizvodiDropdown;
    @FindBy(xpath = "//a[text()=\"Bela tehnika\"]")
    WebElement belaTehnikaDropDownHover;
    @FindBy(xpath = "//a[text()=\"Šporeti\"]")
    WebElement sporetiLink;


    public RegistrationPage adButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(reklama2XButton)).click();
        return this;
    }
    public RegistrationPage imeInputFieldSendKeys(String ime) {
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField));
        imeInputField.clear();
        imeInputField.sendKeys(ime);
        return this;
    }

    public RegistrationPage prezimeInputFieldSendkeys(String prezime) {
        wdWait.until(ExpectedConditions.visibilityOf(prezimeInputField)).clear();
        prezimeInputField.sendKeys(prezime);
        return this;
    }

    public RegistrationPage emailInputFieldSendKeys(String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);
        return this;
    }

    public RegistrationPage newsLetterCheckBoxAlwaysUnchecked() {
        wdWait.until(ExpectedConditions.elementToBeClickable(newsLetterCheckBox));
        if (newsLetterCheckBox.isSelected())
            newsLetterCheckBox.click();
        return this;
    }

    public RegistrationPage pravnoLiceDropdown() {
        Select pravnolice = new Select(pravnoLiceDropdown);
        pravnolice.selectByVisibleText("Da");
        return this;
    }

    public RegistrationPage firmaInputFieldSendKeys(String firma) {
        wdWait.until(ExpectedConditions.visibilityOf(firmaInputField)).clear();
        firmaInputField.sendKeys(firma);
        return this;
    }

    public RegistrationPage pibInputFieldSendKeys(String pib) {
        wdWait.until(ExpectedConditions.visibilityOf(pibInputField)).clear();
        pibInputField.sendKeys(pib);
        return this;
    }

    public RegistrationPage lozinkaInputFieldSendKeys(String lozinka) {
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(lozinka);
        return this;
    }

    public RegistrationPage potvrdaLozinkeInputFieldSendKeys(String potvrdaLozinke) {
        wdWait.until(ExpectedConditions.visibilityOf(potvrdaLozinkeInputField)).clear();
        potvrdaLozinkeInputField.sendKeys(potvrdaLozinke);
        return this;
    }

    public RegistrationPage reklamaButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(reklamaButton)).click();
        return this;
    }

    public RegistrationPage prihvatamButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(prihvatamButton)).click();
        return this;
    }

    public RegistrationPage posaljiButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(posaljiButton)).click();
        return this;
    }
    public boolean wrongEmailRegistrationMesageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(wrongEmailRegistrationMesage));
        return wrongEmailRegistrationMesage.isDisplayed();
    }
    public String wrongEmailRegistrationMesageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(wrongEmailRegistrationMesage));
        return wrongEmailRegistrationMesage.getText();
    }

    public boolean nevalidanPibMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(nevalidanPibMessage));
        return nevalidanPibMessage.isDisplayed();
    }
    public String nevalidanPibMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(nevalidanPibMessage));
        return nevalidanPibMessage.getText();
    }
    public boolean firmaInputFieldEmptyMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(firmaInputFieldEmptyMessage));
        return firmaInputFieldEmptyMessage.isDisplayed();
    }
    public String firmaInputFieldEmptyMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(firmaInputFieldEmptyMessage));
        return firmaInputFieldEmptyMessage.getText();
    }
    public boolean razliciteSifreMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(razliciteSifreMessage));
        return razliciteSifreMessage.isDisplayed();
    }
    public String razliciteSifreMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(razliciteSifreMessage));
        return razliciteSifreMessage.getText();
    }
    public RegistrationPage sviProizvodiDropdownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(sviProizvodiDropdown));
        actions.moveToElement(sviProizvodiDropdown).perform();
        return this;
    }

    public RegistrationPage belaTehnikaDropDownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(belaTehnikaDropDownHover));
        actions.moveToElement(belaTehnikaDropDownHover).perform();
        return this;
    }

    public RegistrationPage sporetiLink() {
        wdWait.until(ExpectedConditions.elementToBeClickable(sporetiLink)).click();
        return this;
    }
}
