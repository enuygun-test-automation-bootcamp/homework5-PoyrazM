package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

public class ValidateHomeAccountTestNG extends BaseTest {

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

    // Home Pagedeki Add Contact butonunun doğru çalışıp çalışmadığı kontrolü
    @Test(priority = 2)
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
    @Test(priority = 3)
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

    // Kişi eklediğim zaman ekleyeceğim gmail hesabının kontrolü yapılmıştır
    @Test(priority = 4)
    public void validateTargetAccount(){
        try{
            Assert.assertEquals(contactPage.getTargetAccountTitle().getText(),"Target Account");
            Assert.assertEquals(contactPage.getTargetAccountMail().getText(),"testermp850@gmail.com");
        }catch (NoSuchElementException exception){
            System.out.println
                    ("TargetAccountTitle and TargetAccountMail elements were not found , please check ContactPage for these elements"
                            +exception.getMessage());
        }
    }

    // Name Field aktif ise name key gönderebileceğinin kontrolü
    @Test(priority = 5)
    public void validateContactName(){
        try {
            Assert.assertEquals(contactPage.getContactNameTitle().getText(),"Contact Name");
            Assert.assertTrue(contactPage.getContactNameEditText().isEnabled());
            contactPage.sendKeysToContactName("home user");
        }catch (NoSuchElementException exception){
            System.out.println("ContactNameTitle and ContactNameEditText elements were not found , please check ContactPage for these elements"
                            +exception.getMessage());
        }
    }

    // Phone Field aktif ise number key gönderebileceğinin kontrolü
    @Test(priority = 6)
    public void validateContactPhone(){
        try {
            Assert.assertEquals(contactPage.getContactPhoneTitle().getText(),"Contact Phone");
            Assert.assertTrue(contactPage.getContactPhoneEditText().isDisplayed());
            contactPage.sendKeysToContactPhone("98928929829");
        }catch (NoSuchElementException exception){
            System.out.println("ContactPhoneTitle and ContactPhoneEditText elements were not found , please check ContactPage for these elements"
                        +exception.getMessage());
        }
    }

    // Phone Field'ın yanındaki Spinner'ı açıp accountu Home seçerek kaydetme kontrolü
    @Test(priority = 7)
    public void validateHomeForContactPhone(){
        try{
            contactPage.clickToPhoneSpinner();
            Assert.assertEquals(contactPage.getAlertTitleText().getText(),"Select label");
            contactPage.goSpinToHome();
        }catch (NoSuchElementException exception){
            System.out.println("PhoneSpinner and AlertTitleText elements were not found , please check ContactPage for these elements"
                        +exception.getMessage());
        }
    }

    // Email Field'ım aktif ise mail key gönderebileceğinin kontrolü
    @Test(priority = 8)
    public void validateContactEmail(){
        try {
            Assert.assertEquals(contactPage.getContactEmailTitle().getText(),"Contact Email");
            Assert.assertTrue(contactPage.getContactEmailEditText().isDisplayed());
            contactPage.sendKeysToContactEmail("test3@mail.com");
        }catch (NoSuchElementException exception){
            System.out.println("ContactEmailTitle and ContactEmailEditText elements were not found , please check ContactPage for these elements"
                        +exception.getMessage());
        }
    }

    // Email Field'ının yanındaki Spinner'ı açıp accountu Home seçerek kaydetme kontrolü
    @Test(priority = 9)
    public void validateHomeForContactEmail(){
        try{
            contactPage.clickToEmailSpinner();
            Assert.assertEquals(contactPage.getAlertTitleText().getText(),"Select label");
            contactPage.goSpinToHome();
        }catch (NoSuchElementException exception){
            System.out.println("EmailSpinner and AlertTitleText elements were not found , please check ContactPage for these elements"
                        +exception.getMessage());
        }
    }

    // Burada text fieldları doldurmuş muyum onun kontrolü yapıldı eğer dolu ise false göndermesi gerekir isEmpty için
    @Test(priority = 10)
    public void validateIsEmptyForTextsFields(){
        try{
            Assert.assertEquals(contactPage.checkTextFieldsIsEmpty().get(0),"false");
            Assert.assertEquals(contactPage.checkTextFieldsIsEmpty().get(1),"false");
            Assert.assertEquals(contactPage.checkTextFieldsIsEmpty().get(2),"false");
        }catch (NoSuchElementException exception){
            System.out.println("Elements were not found for TextFields , please check ContactPage for these elements"
                    +exception.getMessage());
        }
    }


    // Save button clickleme kontrolü
    @Test(priority = 11)
    public void validateSaveButton(){
        try {
            Assert.assertEquals(contactPage.getSaveButton().getText(),"Save");
            contactPage.clickSaveButton();
        }catch (NoSuchElementException exception){
            System.out.println("SaveButton element was not found , please check ContactPage for this element"
                    +exception.getMessage());
        }
    }

    // Dinamik bir şekilde xpath'ime girdiğim texte göre user kaydolmuş mu kontrolü
    @Test(priority = 12)
    public void validateChecksNewContact(){
        try{
            homePage.waitLastName();
            Assert.assertEquals(homePage.dynamicCheckSavedName("home user").getText(),"home user");
        }catch (NoSuchElementException exception){
            System.out.println("Please be careful elements visibility and may be CheckSavedName element was not found , please check HomePage for this element"
                    +exception.getMessage());
        }
    }
}
