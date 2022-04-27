package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OceneBekoFSS54010DWPage extends BaseTest {
    public OceneBekoFSS54010DWPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//strong[text()=\"Beko kombinovani sporet\"]")
    WebElement commentTitleBeko;

    public boolean commentTitleBekoMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(commentTitleBeko));
        return commentTitleBeko.isDisplayed();
    }

    public String commentTitleBekoMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(commentTitleBeko));
        return commentTitleBeko.getText();
    }
    @FindBy(xpath = "//strong[text()=\"(13.01.2021)\"]")
    WebElement commentTitleDate;

    public boolean commentTitleDateMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(commentTitleDate));
        return commentTitleDate.isDisplayed();
    }

    public String commentTitleDateMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(commentTitleDate));
        return commentTitleDate.getText();
    }
    @FindBy(xpath = "//p[contains(text(), \"Kupili smo \")]")
    WebElement commentMessage;

    public boolean commentMessageMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(commentMessage));
        return commentMessage.isDisplayed();
    }

    public String commentMessageMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(commentMessage));
        return commentMessage.getText();
    }
    @FindBy(xpath = "//span[text()=\"Milenka\"]")
    WebElement commentNameMessage;

    public boolean commentNameMessageMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(commentNameMessage));
        return commentNameMessage.isDisplayed();
    }

    public String commentNameMessageMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(commentNameMessage));
        return commentNameMessage.getText();
    }
}
