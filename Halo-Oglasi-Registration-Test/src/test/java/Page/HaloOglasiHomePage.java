package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHomePage extends HaloOglasiBaseTest {
    public HaloOglasiHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(partialLinkText = "Uloguj se")
    WebElement ulogujSeButton;
    public HaloOglasiHomePage ulogujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
        return this;
    }
}
