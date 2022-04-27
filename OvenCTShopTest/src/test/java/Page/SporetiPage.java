package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SporetiPage extends BaseTest {
    public SporetiPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[text()=\"Kombinovani šporeti\"]")
    WebElement kombinovaniSporetiLink;
    public SporetiPage kombinovaniSporetiLink() {
        wdWait.until(ExpectedConditions.elementToBeClickable(kombinovaniSporetiLink)).click();
        return this;
    }
}
