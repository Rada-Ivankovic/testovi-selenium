package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorPage extends HaloOglasiBaseTest {
    public MailinatorPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="search")
    WebElement publicInboxInputField;

    public MailinatorPage publicInboxInputFieldSendKeys(String mail){
        wdWait.until(ExpectedConditions.visibilityOf(publicInboxInputField)).clear();
        publicInboxInputField.sendKeys(mail) ;
        return this;
    }
    public MailinatorPage PublicInboxInputFieldSendKeyboardKeys(Keys keyboardButton){
        wdWait.until(ExpectedConditions.visibilityOf(publicInboxInputField)).sendKeys(keyboardButton);
        return this;
    }
}
