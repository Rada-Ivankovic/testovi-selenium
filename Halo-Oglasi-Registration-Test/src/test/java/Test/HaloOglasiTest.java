package Test;

import Base.HaloOglasiBaseTest;
import Page.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HaloOglasiTest extends HaloOglasiBaseTest {
    HaloOglasiHomePage haloOglasiHomePage;
    HaloOglasiLogInPage haloOglasiLogInPage;
    HaloOglasiRegistrationPage haloOglasiRegistrationPage;
    HaloOglasiSuccessfulRegistrationPage haloOglasiSuccessfulRegistrationPage;
    MailinatorPage mailinatorPage;
    MailinatorInboxPage mailinatorInboxPage;
    HaloOglasiEmailMailinatorPage haloOglasiEmailPageMailnator;
    HaloOglasiAktivacijaKorisnickogNalogaPage haloOglasiAktivacijaKorisnickogNalogaPage;
    HaloOglasiProfilePage haloOglasiProfilePage;

    Random random = new Random();
    String testIme = "qaqwq" + random.nextInt(999999);
    String testEmail = testIme + "@mailinator.com";
    String uspesnaRegistracijaMessage = "Registracija je uspela!\n" +
            "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : ";
    String mailinatorUrl = "https://www.mailinator.com/";
    String uspesnaAktivacijaMessage = "Vaš nalog je uspešno aktiviran!";
    String email = "email: ";

    @Before
    public void setUpTest() {
        haloOglasiHomePage = new HaloOglasiHomePage();
        haloOglasiLogInPage = new HaloOglasiLogInPage();
        haloOglasiRegistrationPage = new HaloOglasiRegistrationPage();
        haloOglasiSuccessfulRegistrationPage = new HaloOglasiSuccessfulRegistrationPage();
        mailinatorPage = new MailinatorPage();
        mailinatorInboxPage = new MailinatorInboxPage();
        haloOglasiEmailPageMailnator = new HaloOglasiEmailMailinatorPage();
        haloOglasiAktivacijaKorisnickogNalogaPage = new HaloOglasiAktivacijaKorisnickogNalogaPage();
        haloOglasiProfilePage = new HaloOglasiProfilePage();
    }
    @Test
    public void haloOglasiTest(){
        haloOglasiHomePage.ulogujSeButtonClick();
        haloOglasiLogInPage.registrujSeLinkClick();
        haloOglasiRegistrationPage.fizickoLiceCheckBox()
                .imeInputFieldSendKeys(testIme)
                .emailInputFieldSendKeys(testEmail)
                .lozinkaInputFieldSendKeys(testIme)
                .ponoviLozinkuInputFieldSendKeys(testIme)
                .saglasnostCheckBox();
        haloOglasiRegistrationPage.registrujMeButton();
        assertTrue(haloOglasiSuccessfulRegistrationPage.uspelaRegistracijaMessageIsDisplayed());
        assertEquals( uspesnaRegistracijaMessage + testEmail +" !"
                ,haloOglasiSuccessfulRegistrationPage.uspelaRegistracijaMessageGetText());
        driver.get(mailinatorUrl);
        mailinatorPage
                .publicInboxInputFieldSendKeys(testIme)
                .PublicInboxInputFieldSendKeyboardKeys(Keys.ENTER);
        mailinatorInboxPage.haloOglasiMailClick();
        haloOglasiEmailPageMailnator
                .switchFocusToIframeBody()
                .aktivirajNalogButtonClick();
        driver.switchTo().defaultContent();
        haloOglasiSuccessfulRegistrationPage.switchToNewTab();
        scroll.executeScript("window.scrollBy(0,400)");
        //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(haloOglasiAktivacijaKorisnickogNalogaPage.nalogUspesnoAktiviranMessageIsDisplayed());
        assertEquals(uspesnaAktivacijaMessage,haloOglasiAktivacijaKorisnickogNalogaPage.nalogUspesnoAktiviranMessageGetText());
        haloOglasiSuccessfulRegistrationPage.prijavaLinkClick();
        haloOglasiLogInPage.imeInputFieldSendKeys(testIme);
        haloOglasiRegistrationPage.lozinkaInputFieldSendKeys(testIme);
        haloOglasiLogInPage.ulogujMeButton();
        haloOglasiProfilePage.mojProfilDropdownHover();
        assertTrue((haloOglasiProfilePage.emailregistrovanMessageIsDisplayed()));
        assertEquals(email + testEmail, haloOglasiProfilePage.emailRegistrovanMessageGetText());
        assertTrue(haloOglasiProfilePage.korisnickoImeRegistrovanoIsDisplayed());
        assertEquals("korisničko ime:", haloOglasiProfilePage.korisnickoImeRegistrovanoGetText());
    }
}
