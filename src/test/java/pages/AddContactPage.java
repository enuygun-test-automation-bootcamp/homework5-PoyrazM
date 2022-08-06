package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

// AddContactPage de ise bu sayfadaki bütün elementler tanımlanmıştır sırasıyla

@Getter @Setter
public class AddContactPage extends BasePage{

    @AndroidFindBy(id = "android:id/title")
    private MobileElement addContactTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Target Account']")
    private MobileElement targetAccountTitle;

    @AndroidFindBy(id = "accountSpinner")
    private MobileElement targetAccountSpinner;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Name']")
    private MobileElement contactNameTitle;

    @AndroidFindBy(id = "android:id/text1")
    private MobileElement targetAccountMail;

    @AndroidFindBy(id = "contactNameEditText")
    private MobileElement contactNameEditText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Phone']")
    private MobileElement contactPhoneTitle;

    @AndroidFindBy(id = "contactPhoneEditText")
    private MobileElement contactPhoneEditText;

    @AndroidFindBy(id = "contactPhoneTypeSpinner")
    private MobileElement contactPhoneSpinner;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Home']")
    private MobileElement spinToHome;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Work']")
    private MobileElement spinToWork;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Mobile']")
    private MobileElement spinToMobile;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Other']")
    private MobileElement spinToOther;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Contact Email']")
    private MobileElement contactEmailTitle;

    @AndroidFindBy(id = "contactEmailEditText")
    private MobileElement contactEmailEditText;

    @AndroidFindBy(id = "contactEmailTypeSpinner")
    private MobileElement contactEmailSpinner;

    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement alertTitleText;

    @AndroidFindBy(id = "contactSaveButton")
    private MobileElement saveButton;

    /*
        Title almaya çalışırken elementi bulmadan text almaya çalışıldığı için testim patlıyordu
        Ben de elemente görünür olduğunda işlem yapması için bekle komutu verdim. Bunu da bir metota tanımladım
     */
    public void waitTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/title")));
    }

    /*
        Add Contact sayfasındaki isim girme alanına isim gönderebilmek için dinamik bir metot oluşturdum
     */
    public void sendKeysToContactName(String name){
        this.contactNameEditText.sendKeys(name);
    }

    /*
        Add Contact sayfasındaki numara girme alanına isim gönderebilmek için dinamik bir metot oluşturdum
     */
    public void sendKeysToContactPhone(String phoneNumber){
        this.contactPhoneEditText.sendKeys(phoneNumber);
    }

    /*
        Add Contact sayfasındaki email girme alanına isim gönderebilmek için dinamik bir metot oluşturdum
     */
    public void sendKeysToContactEmail(String email){
        this.contactEmailEditText.sendKeys(email);
    }

    /*
        Numara girme alanının yanındaki spinnera tıklamak için bir metot oluşturdum.
     */
    public void clickToPhoneSpinner(){
        Assert.assertTrue(this.contactPhoneSpinner.isEnabled());
        this.contactPhoneSpinner.click();
    }

    /*
        Email girme alanının yanındaki spinnera tıklamak için bir metot oluşturdum.
     */
    public void clickToEmailSpinner(){
        Assert.assertTrue(this.contactEmailSpinner.isEnabled());
        this.contactEmailSpinner.click();
    }

    /*
        Numara ve isim girme alanında açılan spinnerın elementleri ortak olduğu için tek bir Home click oluşturdum
     */
    public void goSpinToHome(){
        Assert.assertTrue(this.spinToHome.isEnabled());
        this.spinToHome.click();
    }

    /*
        Numara ve isim girme alanında açılan spinnerın elementleri ortak olduğu için tek bir Work click oluşturdum
     */
    public void goSpinToWork(){
        Assert.assertTrue(this.spinToWork.isEnabled());
        this.spinToWork.click();
    }

    /*
        Numara ve isim girme alanında açılan spinnerın elementleri ortak olduğu için tek bir Mobile click oluşturdum
     */
    public void goSpinToMobile(){
        Assert.assertTrue(this.spinToMobile.isEnabled());
        this.spinToMobile.click();
    }

    /*
        Numara ve isim girme alanında açılan spinnerın elementleri ortak olduğu için tek bir Other click oluşturdum
     */
    public void goSpinToOther(){
        Assert.assertTrue(this.spinToOther.isEnabled());
        this.spinToOther.click();
    }

    /*
        Fieldları doldurduktan sonra save butonuna tıklamadan önce doldurulan text fieldlarının
        boş olup olmadığı kontrolü için bir metot oluşturuldu
     */
    public List<String> checkTextFieldsIsEmpty(){
        List<String> fieldIsEmpty = new ArrayList<>();
        fieldIsEmpty.add(String.valueOf(this.contactNameEditText.getText().isEmpty()));
        fieldIsEmpty.add(String.valueOf(this.contactPhoneEditText.getText().isEmpty()));
        fieldIsEmpty.add(String.valueOf(this.contactEmailEditText.getText().isEmpty()));
        return fieldIsEmpty;
    }

    /*
        Save butonuna tıklamak için bir metot oluşturuldu
     */
    public void clickSaveButton(){
        Assert.assertTrue(this.saveButton.isEnabled());
        this.saveButton.click();

    }

    /*
        ValidaNumberLimitPhone testimdeki numara fieldındaki karakter sınırı için sırasıyla 1 den başlayıp
        100'e rakama çıkınca durduran bir algoritma yazarak sendkeys olarak gönderdim. Eğer counta 1000 yazsaydım
        1000 rakamlık haneye çıkıncaya kadar devam ederdi digit göndermeye
     */
    public void hundredDigitPush(){
        String digit = "8";
        for (int i = 0; i < digit.repeat(100).length();i++){
            if (i == 100)
            {
                break;
            }
            this.contactPhoneEditText.sendKeys(digit);
        }
    }
}

