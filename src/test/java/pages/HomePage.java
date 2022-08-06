package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


// Bu sınıfım Home Page'deki elementleri doldurup , bazı operasyonlar tanımladığım classtır
@Getter @Setter
public class HomePage extends BasePage{


    @AndroidFindBy(id = "android:id/title")
    private MobileElement homePageTitle;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement showInvisibleCheckBox;

    @AndroidFindBy(id = "addContactButton")
    private MobileElement addContactButton;

    /*
        Show invisible checkbox'una tıklatan metot
     */
    public void clickShowInvisible(){
        this.showInvisibleCheckBox.click();
    }

    /*
        Add contact butonuna tıklatan metot
     */
    public void clickAddContactButton(){
        this.addContactButton.click();
    }

    /*
        Her kayıt sonrası , kaydedilen userları bulmak için dinamik bir xpath yazdım. Kaydedilen kullanıcının
        ismi yazılarak xpathtten element kontrolü yapılır.
     */
    public WebElement dynamicCheckSavedName(String name){
       WebElement checkSave = Driver.findElement(By.xpath("//android.widget.TextView[@text='"+name+"']"));
        return checkSave;
    }

    /*
        Kaydedilen isim için element görünürlüğü sağlanana kadar bekleme metotu
     */
    public void waitLastName(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactEntryText")));
    }

}
