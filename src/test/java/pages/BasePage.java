package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import org.openqa.selenium.support.PageFactory;
import utility.BaseTest;



// Bu BasePage sadece yapıcıda initialization döndürmek için üretilip , Parent Page classım oldu
public class BasePage extends BaseTest {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver), this);
    }


}
