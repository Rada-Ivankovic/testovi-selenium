package page;

import base.BaseTest;
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
    @FindBy(css = ".ub-emb-close")
    WebElement reklama2XButton;
    @FindBy(css = ".am-opener")
    WebElement sviProizvodiDropdown;
    @FindBy(xpath = "//a[text()=\"Bela tehnika\"]")
    WebElement belaTehnikaDropDownHover;
    @FindBy(xpath = "//a[text()=\"Šporeti\"]")
    WebElement sporetiLink;


    public void adButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(reklama2XButton)).click();
    }
    public void imeInputFieldSendKeys(String ime) {
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField));
        imeInputField.clear();
        imeInputField.sendKeys(ime);
    }

    public void prezimeInputFieldSendKeys(String prezime) {
        wdWait.until(ExpectedConditions.visibilityOf(prezimeInputField)).clear();
        prezimeInputField.sendKeys(prezime);
    }

    public void emailInputFieldSendKeys(String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);
    }

    public void newsLetterCheckBoxAlwaysUnchecked() {
        wdWait.until(ExpectedConditions.elementToBeClickable(newsLetterCheckBox));
        if (newsLetterCheckBox.isSelected())
            newsLetterCheckBox.click();
    }

    public void pravnoLiceDropdown() {
        Select pravnolice = new Select(pravnoLiceDropdown);
        pravnolice.selectByVisibleText("Da");
    }

    public void firmaInputFieldSendKeys(String firma) {
        wdWait.until(ExpectedConditions.visibilityOf(firmaInputField)).clear();
        firmaInputField.sendKeys(firma);
    }

    public void pibInputFieldSendKeys(String pib) {
        wdWait.until(ExpectedConditions.visibilityOf(pibInputField)).clear();
        pibInputField.sendKeys(pib);
    }

    public void lozinkaInputFieldSendKeys(String lozinka) {
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(lozinka);
    }

    public void potvrdaLozinkeInputFieldSendKeys(String potvrdaLozinke) {
        wdWait.until(ExpectedConditions.visibilityOf(potvrdaLozinkeInputField)).clear();
        potvrdaLozinkeInputField.sendKeys(potvrdaLozinke);
    }

    public void reklamaButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(reklamaButton)).click();
    }

    public void prihvatamButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(prihvatamButton)).click();
    }

    public void posaljiButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(posaljiButton)).click();
    }

   public void sviProizvodiDropdownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(sviProizvodiDropdown));
        actions.moveToElement(sviProizvodiDropdown).perform();
    }

    public void belaTehnikaDropDownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(belaTehnikaDropDownHover));
        actions.moveToElement(belaTehnikaDropDownHover).perform();
    }

    public void sporetiLink() {
        wdWait.until(ExpectedConditions.elementToBeClickable(sporetiLink)).click();
    }
}
