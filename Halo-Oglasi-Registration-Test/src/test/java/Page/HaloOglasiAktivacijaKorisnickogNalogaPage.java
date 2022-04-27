package Page;

import Base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiAktivacijaKorisnickogNalogaPage extends HaloOglasiBaseTest {
    public HaloOglasiAktivacijaKorisnickogNalogaPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Vaš nalog je uspešno aktiviran!')]")
    WebElement nalogUspesnoAktiviran;

    public boolean nalogUspesnoAktiviranMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(nalogUspesnoAktiviran));
        return nalogUspesnoAktiviran.isDisplayed();
    }

    public String nalogUspesnoAktiviranMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(nalogUspesnoAktiviran));
        return nalogUspesnoAktiviran.getText();
    }

    @FindBy(partialLinkText = "Produžite na stranicu za logovanje kako biste pristupili našem portalu. ")
    WebElement nalogUspesnoAktiviran2;

    public boolean nalogUspesnoAktiviranMassage2IsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(nalogUspesnoAktiviran2));
        return nalogUspesnoAktiviran2.isDisplayed();
    }

    public String nalogUspesnoAktiviranMessage2GetText() {
        wdWait.until(ExpectedConditions.visibilityOf(nalogUspesnoAktiviran2));
        return nalogUspesnoAktiviran2.getText();
    }

    @FindBy(css = "a[href='/prijava']")
    WebElement prijavaButton;

    public HaloOglasiAktivacijaKorisnickogNalogaPage prijavaButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(prijavaButton)).click();
        return this;

    }
}
