package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiEmailMailinatorPage extends HaloOglasiBaseTest {
    public HaloOglasiEmailMailinatorPage() {
        PageFactory.initElements(driver, this);
    }

    //moze i ovaj locator @FindBy (linktext = "Aktiviraj nalog")
    @FindBy(xpath = "//strong[text()=\"Aktiviraj nalog\"]")
    WebElement aktivirajNalogButton;

    @FindBy(id = "html_msg_body")
    WebElement iframeBody;

    //   public void aktivirajNalogButtonClick() {
    //   wdWait.until(ExpectedConditions.visibilityOf(iframeBody));
    //   driver.switchTo().frame(iframeBody);
    //   driver.switchTo().defaultContent();
    //        }

    public HaloOglasiEmailMailinatorPage aktivirajNalogButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(aktivirajNalogButton)).click();
        return this;
    }

    public HaloOglasiEmailMailinatorPage switchFocusToIframeBody() {
        wdWait.until(ExpectedConditions.visibilityOf(iframeBody));
        driver.switchTo().frame(iframeBody);
        return this;
    }

    public HaloOglasiEmailMailinatorPage switchFocusToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }
}
