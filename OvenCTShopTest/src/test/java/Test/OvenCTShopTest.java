package Test;

import Base.BaseTest;
import Page.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OvenCTShopTest extends BaseTest {
    RegistrationPage registrationPage;
    SporetiPage sporetiPage;
    KombinovaniSporetiPage kombinovaniSporetiPage;
    GorenjeK5111WGPage gorenjeK5111WGPage;
    BekoFSS54010DWPage bekoFSS54010DWPage;
    OceneBekoFSS54010DWPage oceneBekoFSS54010DWPage;
    String proveraBelaBojaMessage = "Bela";
    String proveraCeneStaraMessage = "33.333 RSD";
    String proveraCeneNovaMessage = "29.999 RSD";
    String commentTitleBekoMessage = "Beko kombinovani sporet";
    String commentTitleDateMessage = "(13.01.2021)";
    String commentMessageMessage = "Kupili smo ovaj beko sporet,jer moze i plin i struja,nije skup,rerna savrseno pece,ringle brzo zagrevaju." +
            " Lak je za ciscenje,nije potrosac veliki. Nismo se pokajali sto smo ga kupili.";
    String commentNameMessageMessage = "Milenka";

    @Before
    public void SetUpTest() {
        registrationPage = new RegistrationPage();
        sporetiPage = new SporetiPage();
        kombinovaniSporetiPage = new KombinovaniSporetiPage();
        gorenjeK5111WGPage = new GorenjeK5111WGPage();
        bekoFSS54010DWPage = new BekoFSS54010DWPage();
        oceneBekoFSS54010DWPage = new OceneBekoFSS54010DWPage();
           }

    @Test
    public void sporetTest() {
        registrationPage
                .sviProizvodiDropdownHover()
                .belaTehnikaDropDownHover()
                .sporetiLink();
        scroll.executeScript("window.scrollBy(0,200)");
        sporetiPage.kombinovaniSporetiLink();
        kombinovaniSporetiPage
                .prihvatamButtonClick()
                .gorenjeCheckboxClick()
                .GorenjeK5111WG();
        assertTrue(gorenjeK5111WGPage.proveraCeneStaraMessageIsDisplayed());
        assertEquals(proveraCeneStaraMessage, gorenjeK5111WGPage.proveraCeneStaraMessageGetText());
        assertTrue(gorenjeK5111WGPage.proveraCeneNovaMessageIsDisplayed());
        assertEquals(proveraCeneNovaMessage, gorenjeK5111WGPage.proveraCeneNovaMessageGetText());
        driver.navigate().back();
        kombinovaniSporetiPage
                .gorenjeCheckboxClick()
        //kombinovaniSporetiPage.reklamaButtonClick();
                .bekoCheckboxClick()
                .BekoFSS54010DW();
        scroll.executeScript("window.scrollBy(0,820)");
        assertTrue(bekoFSS54010DWPage.proveraBeleBojaMessageIsDisplayed());
        assertEquals(proveraBelaBojaMessage, bekoFSS54010DWPage.proveraBelaBojaMessageGetText());
        bekoFSS54010DWPage.oceneProizvodaButtonClick();
        scroll.executeScript("window.scrollBy(0,900)");
        assertTrue(oceneBekoFSS54010DWPage.commentTitleBekoMessageIsDisplayed());
        assertEquals(commentTitleBekoMessage, oceneBekoFSS54010DWPage.commentTitleBekoMessageGetText());
        assertTrue(oceneBekoFSS54010DWPage.commentTitleDateMessageIsDisplayed());
        assertEquals(commentTitleDateMessage, oceneBekoFSS54010DWPage.commentTitleDateMessageGetText());
        assertTrue(oceneBekoFSS54010DWPage.commentMessageMessageIsDisplayed());
        assertEquals(commentMessageMessage, oceneBekoFSS54010DWPage.commentMessageMessageGetText());
        assertTrue(oceneBekoFSS54010DWPage.commentNameMessageMessageIsDisplayed());
        assertEquals(commentNameMessageMessage, oceneBekoFSS54010DWPage.commentNameMessageMessageGetText());
    }
}
