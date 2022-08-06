package utility;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.AddContactPage;
import pages.HomePage;
import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.InvalidPathException;


import static com.thoughtworks.selenium.Wait.DEFAULT_TIMEOUT;

// Test öncesinde config işlemleri bu classta tamamlanır
public class BaseTest {

    public static AppiumDriver<?> Driver;
    public static WebDriverWait wait;
    public static HomePage homePage;
    public static AddContactPage contactPage;
    String oreo;
    DesiredCapabilities capabilities;

    public BaseTest(){
        this.oreo = DeviceFarm.ANDROID_OREO.path;
    }


    @BeforeSuite
    public void configAppiumDriver() {

        this.capabilities = new DesiredCapabilities();
        // capabilities paketi altındaki json dosyasını okuyup , config işlemlerini o jsona göre yapma işlemi
        try {
            this.capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.oreo);
        }catch (InvalidPathException exception){
            System.out.println("Please add correct path , this path is not working"+exception.getMessage());
        }

        // APK dosyasının pathi verilmiştir.
        try{
            File appDir = new File("src/test/resources/apps");
            File app = new File(appDir,"ContactManager.apk");
            this.capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        }catch (WebDriverException exception){
            System.out.println("Please add apk , was not find file APK or APK path"+exception.getMessage());
        }

        // Remote url oluşturulmuştur appium testleri için , bilgisayarda tanımlanan default Appium konfigürasyonu için
        try {
            Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),this.capabilities);
        }catch (MalformedURLException exception){
            System.out.println("Please set correct remote url hub :\t"+exception.getMessage());
        }
        wait = new WebDriverWait(Driver, DEFAULT_TIMEOUT);
    }

    // Teste başlamadan pagelerdeki objeler ve metotları kullanabilmem için sınıfları create etme işlemim
    @BeforeTest
    public void createPages(){
        homePage = new HomePage();
        contactPage = new AddContactPage();
    }

    // Olan biten bütün operasyonlar sonunda Driver'ım çalışır halde ise bir zahmet kapatır mısın JAVAAAAA!!!!
    // Değil tabii ki , lütfen diyelim arkadaşlar , kibar olalım çünkü Java'cığımın da bir kalbi var
    @AfterSuite
    public void tearDown() {
        if (Driver != null) {
            Driver.quit();
        }
    }
}
