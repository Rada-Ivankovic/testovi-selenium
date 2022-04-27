package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SuccessfulRegistrationPage extends BaseTest {
    public SuccessfulRegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".alert-success")
    WebElement successfulRegistrationMessage;
    @FindAll({
            @FindBy(css = ".alert.alert-succes")
    })public List<WebElement> successfulRegistration;


    public boolean successfulRegistrationMessageNotDisplayed() {
        if (successfulRegistration.size()==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean successfulRegistrationMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.isDisplayed();

    }
    public String successfulRegistrationMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.getText();
    }
    @FindBy(css = ".alert-warning")
    WebElement wrongEmailRegistrationMesage;
    public boolean wrongEmailRegistrationMesageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(wrongEmailRegistrationMesage));
        return wrongEmailRegistrationMesage.isDisplayed();
    }
    public String wrongEmailRegistrationMesageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(wrongEmailRegistrationMesage));
        return wrongEmailRegistrationMesage.getText();
    }
    @FindBy(css = ".alert-warning")
    WebElement nevalidanPibMessage;
    @FindBy(css = ".alert-warning")
    WebElement firmaInputFieldEmptyMessage;
    @FindBy(css = ".alert-warning")
    WebElement razliciteSifreMessage;
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
}
