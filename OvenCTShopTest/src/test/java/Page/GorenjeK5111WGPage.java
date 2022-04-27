package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GorenjeK5111WGPage extends BaseTest {
    public GorenjeK5111WGPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".price-cont.pull-left")
    WebElement proveraCeneStaraMessage;

    public boolean proveraCeneStaraMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraCeneStaraMessage));
        return proveraCeneStaraMessage.isDisplayed();
    }

    public String proveraCeneStaraMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraCeneStaraMessage));
        return proveraCeneStaraMessage.getText();
    }

    @FindBy(css = ".extra-discount-price.pull-left")
    WebElement proveraCeneNovaMessage;

    public boolean proveraCeneNovaMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraCeneNovaMessage));
        return proveraCeneNovaMessage.isDisplayed();
    }

    public String proveraCeneNovaMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(proveraCeneNovaMessage));
        return proveraCeneNovaMessage.getText();
    }
}
