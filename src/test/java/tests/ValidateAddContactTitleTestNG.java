package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utility.BaseTest;



public class ValidateAddContactTitleTestNG extends BaseTest {

    // Home Page'de dönen Title textinin doğruluğunun kontrolü
    @Test(priority = 1)
    public void validateCheckHomePageTitle(){
        try {
            Assert.assertEquals(homePage.getHomePageTitle().getText(),"Contact Manager");
        }catch (NoSuchElementException exception){
            System.out.println
                    ("Page Title element was not found , please check HomePage for this element"
                            +exception.getMessage());
        }
    }

    // Burada Show Invisible checkboxunun testi yazıldı ama ignoreladım çünkü kaydetme işlemlerinde
    // check box tikli olarak kalıyordu ve son test steplerinde patlatabiliyordu ve ekstra click işlemi çıkartıyordu
    // Doğru çalışma kontrolü için sadece bu casemde ignore kaldırarak test edebilirim
    @Ignore
    @Test(priority = 2)
    public void validateInvisibleCheckBox(){
        try{
            Assert.assertTrue(homePage.getShowInvisibleCheckBox().isEnabled());
            homePage.clickShowInvisible();
        }catch (NoSuchElementException exception){
            System.out.println
                    ("Checkbox element was not found , please check HomePage for this element"
                            +exception.getMessage());
        }
    }

    // Home Pagedeki Add Contact butonunun doğru çalışıp çalışmadığı kontrolü
    @Test(priority = 3)
    public void validateAddContactButton() {
        try {
            Assert.assertTrue(homePage.getAddContactButton().isEnabled());
            homePage.clickAddContactButton();
        }catch (NoSuchElementException exception){
            System.out.println
                    ("AddContactButton element was not found , please check HomePage for this element"
                            +exception.getMessage());
        }
    }

    // Add Contact Pagesine geldikten sonra Title kontrolü
    @Test(priority = 4)
    public void validateAddContactPageTitle(){
        try {
            contactPage.waitTitle();
            Assert.assertEquals(contactPage.getAddContactTitle().getText(),"Add Contact");
        }catch (NoSuchElementException exception){
            System.out.println
                    ("AddContactTitle element was not found , please check ContactPage for this element"
                            +exception.getMessage());
        }
    }
}
