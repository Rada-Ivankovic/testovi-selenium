package test;

import base.BaseTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import page.RegistrationPage;
import page.SuccessfulRegistrationPage;

import java.util.Random;
import java.util.UUID;

public class RegistrationCTShopTest extends BaseTest {
    RegistrationPage registrationPage;
    SuccessfulRegistrationPage successfulRegistrationPage;
    Random random = new Random();
    String testIme = "Jova" + random.nextInt(999999);
    String testPrezime = "Jovic" + random.nextInt(999999);
    String testEmail = testIme + "@abc.com";
    String testLozinka = "12345678";
    String testFirma = "neka";
    String testPib = "123456789";
    String successfulRegistrationMessage = "Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.";
    String unsuccessfulRegistrationSameEmailMessage = "Već postoji nalog sa unetom email adresom! Molimo ulogujte se!";
    String wrongPibMessage = "PIB mora sadržati tačno 9 cifara!";
    String firmaFieldEmptyMessage = "Niste uneli naziv Firme!";
    String differentPasswordMessage = "Razlikuju se lozinka i potvrda lozinke!";


    @Before
    public void setUpTest(){
        registrationPage = new RegistrationPage();
        successfulRegistrationPage = new SuccessfulRegistrationPage();
    }

    @Test
    public void successfulRegistrationTest(){
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys(testEmail);
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.successfulRegistrationMessageIsDisplayed());
        assertEquals(successfulRegistrationMessage,
                successfulRegistrationPage.successfulRegistrationMessageGetText());
    }

    @Test
    public void sameEmailRegistrationTest(){
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys("abc@abc.abc");
        //ovde sam unela mail za koj znam da je vec unosen jer zelim da proverim u testu
        // da li je moguce registrovati se sa istim/postojecim mail-om a ostali kredencijali da budu razliciti
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
        //registrationPage.reklamaButtonClick();
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.wrongEmailRegistrationMesageIsDisplayed());
        assertEquals(unsuccessfulRegistrationSameEmailMessage,successfulRegistrationPage.wrongEmailRegistrationMesageGetText());
        //registrationPage.adButtonClick();
           }

    @Test
    public void unsuccessfulRegistrationWrongPib(){
        registrationPage.imeInputFieldSendKeys(testIme);
                registrationPage.prezimeInputFieldSendKeys(testPrezime);
                registrationPage.emailInputFieldSendKeys(testEmail);
                registrationPage.newsLetterCheckBoxAlwaysUnchecked();
                registrationPage.pravnoLiceDropdown();
                registrationPage.firmaInputFieldSendKeys(testFirma);
                registrationPage.pibInputFieldSendKeys("123456qa");
                registrationPage.lozinkaInputFieldSendKeys(testLozinka);
                registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
                registrationPage.prihvatamButtonClick();
                registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.nevalidanPibMessageIsDisplayed());
        assertEquals(wrongPibMessage,successfulRegistrationPage.nevalidanPibMessageGetText());
    }

    @Test
    public void unsuccessfulRegistrationFirmaEmpty (){
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys(testEmail);
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.pravnoLiceDropdown();
        registrationPage.firmaInputFieldSendKeys("");
        registrationPage.pibInputFieldSendKeys(testPib);
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.firmaInputFieldEmptyMessageIsDisplayed());
        assertEquals(firmaFieldEmptyMessage,successfulRegistrationPage.firmaInputFieldEmptyMessageGetText());
    }

    @Test
    public void unsuccessfulRegistrationDifferentPasswords () {
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys(testEmail);
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.pravnoLiceDropdown();
        registrationPage.firmaInputFieldSendKeys(testFirma);
        registrationPage.pibInputFieldSendKeys(testPib);
        registrationPage.lozinkaInputFieldSendKeys("12345678");
        registrationPage.potvrdaLozinkeInputFieldSendKeys("1234567");
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.razliciteSifreMessageIsDisplayed());
        assertEquals(differentPasswordMessage,successfulRegistrationPage.razliciteSifreMessageGetText());
    }

    @Test
    public void wrongPibWith9CharathersUnsuccessfulRegistration(){
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys(testEmail);
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.pravnoLiceDropdown();
        registrationPage.firmaInputFieldSendKeys(testFirma);
        registrationPage.pibInputFieldSendKeys("123456qaa");
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.nevalidanPibMessageIsDisplayed());
        assertEquals(wrongPibMessage,successfulRegistrationPage.nevalidanPibMessageGetText());
    }
    @Test
    public void unsuccessfulRegistrationPibEmpty(){
        registrationPage.imeInputFieldSendKeys(testIme);
        registrationPage.prezimeInputFieldSendKeys(testPrezime);
        registrationPage.emailInputFieldSendKeys(testEmail);
        registrationPage.newsLetterCheckBoxAlwaysUnchecked();
        registrationPage.pravnoLiceDropdown();
        registrationPage.firmaInputFieldSendKeys(testFirma);
        registrationPage.pibInputFieldSendKeys("");
        registrationPage.lozinkaInputFieldSendKeys(testLozinka);
        registrationPage.potvrdaLozinkeInputFieldSendKeys(testLozinka);
        registrationPage.prihvatamButtonClick();
        registrationPage.posaljiButtonClick();
        assertTrue(successfulRegistrationPage.nevalidanPibMessageIsDisplayed());
        assertEquals(wrongPibMessage,successfulRegistrationPage.nevalidanPibMessageGetText());
    }
}
