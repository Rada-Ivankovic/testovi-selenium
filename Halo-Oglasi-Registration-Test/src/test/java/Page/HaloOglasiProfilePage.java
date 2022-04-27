package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiProfilePage extends HaloOglasiBaseTest {
    public HaloOglasiProfilePage() {
        PageFactory.initElements(driver, this);
    }
    //@FindBy(className = ".header-label") on radio ovako,moze oba lokatora
    @FindBy(css = ".header-label")
    WebElement mojProfilDropdown;

    public HaloOglasiProfilePage mojProfilDropdownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(mojProfilDropdown));
        actions.moveToElement(mojProfilDropdown).perform();
        return this;
    }
    @FindBy(className = "user-display-name")
    WebElement korisnickoIme;

    //@FindBy(xpath = "//p[contains(text(),\"saass@mailinator.com\")]")
    @FindBy(xpath = "(//p[@class='user-email'])[1]")
    WebElement emailRegistrovan;
    //@FindBy(className = "user-email")
    //WebElement korisnickiEmail; - sve ovo je isto kao ovo moje samo prostije
    public boolean emailregistrovanMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(emailRegistrovan));
        return emailRegistrovan.isDisplayed();
    }
    public String emailRegistrovanMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(emailRegistrovan));
        return emailRegistrovan.getText();
    }
    @FindBy(xpath = "(//span[@class='user-data-label'][contains(text(),'korisničko ime:')])[1]")
    WebElement korisnickoImeRegistrovano;

    public boolean korisnickoImeRegistrovanoIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeRegistrovano));
        return korisnickoImeRegistrovano.isDisplayed();
    }
    public String korisnickoImeRegistrovanoGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeRegistrovano));
        return korisnickoImeRegistrovano.getText();
    }
}
