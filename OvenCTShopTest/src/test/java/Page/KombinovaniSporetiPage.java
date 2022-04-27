package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KombinovaniSporetiPage extends BaseTest {
    public KombinovaniSporetiPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[text()=\"Gorenje\"]")
    WebElement gorenjeCheckbox;

    public KombinovaniSporetiPage gorenjeCheckboxClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(gorenjeCheckbox));
        gorenjeCheckbox.click();
        return this;
    }

    @FindBy(partialLinkText = "Gorenje K5111WG")
    WebElement gorenjeK5111WGLink;

    public KombinovaniSporetiPage GorenjeK5111WG() {
        wdWait.until(ExpectedConditions.elementToBeClickable(gorenjeK5111WGLink)).click();
        return this;
    }

    @FindBy(xpath = "//button[text()='Prihvatam']")
    WebElement prihvatamButton;

    public KombinovaniSporetiPage prihvatamButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(prihvatamButton)).click();
        return this;
    }

    @FindBy(className = "ub-emb-close")
    WebElement reklamaButton;

    public KombinovaniSporetiPage reklamaButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(reklamaButton)).click();
        return this;
    }

    @FindBy(xpath = "//label[text()=\"Beko\"]")
    WebElement bekoCheckbox;

    public KombinovaniSporetiPage bekoCheckboxClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(bekoCheckbox));
        bekoCheckbox.click();
        return this;
    }
    @FindBy(partialLinkText = "Beko FSS54010DW")
    WebElement bekoFSS54010DWLink;

    public KombinovaniSporetiPage BekoFSS54010DW() {
        wdWait.until(ExpectedConditions.elementToBeClickable(bekoFSS54010DWLink)).click();
        return this;
    }
}
