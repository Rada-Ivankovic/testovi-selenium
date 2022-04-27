package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInboxPage extends HaloOglasiBaseTest {
    public MailinatorInboxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[contains(text(),\" Molimo aktivirajte Vaš Halo oglasi nalog\")]")
    WebElement haloOglasiMail;

    public MailinatorInboxPage haloOglasiMailClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(haloOglasiMail)).click();
        return this;
    }
}
