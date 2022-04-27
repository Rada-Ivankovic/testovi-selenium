package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Base.BaseTest.driver;
import static Base.BaseTest.wdWait;

public class BekoFSS54010DWPage extends BaseTest {
    public BekoFSS54010DWPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[text()=\"Bela\"]")
    WebElement proveraBelaBoja;

    public boolean proveraBeleBojaMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraBelaBoja));
        return proveraBelaBoja.isDisplayed();
    }

    public String proveraBelaBojaMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraBelaBoja));
        return proveraBelaBoja.getText();
    }
    @FindBy(xpath = "//a[text()=\"Ocene\"]")
    WebElement oceneProizvodaButton;

    public BekoFSS54010DWPage oceneProizvodaButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(oceneProizvodaButton)).click();
        return this;
    }
}
