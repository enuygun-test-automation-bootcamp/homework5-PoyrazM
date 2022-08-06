package tests;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonValidateTestNG {

    // Bu classta capabilities'deki pathini çektiğim jsonu doğru çekip çekmediğimi kontrol etmek için test yazdım

    @Test
    public void jsonValidation() throws JsonProcessingException {

        // Map'e String , String şeklinde çekmesi gerektiğini beklediğim bir data tutucu oluşturdum

        Map<String,String> jsonValid = new HashMap<>();
        jsonValid.put("appium:deviceName","oreo");
        jsonValid.put("platformName","ANDROID");
        jsonValid.put("appium:automationName","UIAutomator2");
        jsonValid.put("appium:udid","emulator-5554");
        jsonValid.put("appium:avd","oreo");

        File capabilities = new File("src/test/resources/capabilities");
        File jsonFile = new File(capabilities,"android-oreo.json");

        JSONParser jsonParser = new JSONParser();

        // Daha sonra json capabilitiesdeki json dosyamı buraya çekerek validation işlemi yapmak istedim
        // Json dosylarımı parseleyip assertion yardımıyla karşılaştırmasını yaptım ve gerçekten json dosyası
        // BaseTest'te doğru configuration'u mu yapmış onu kontrol ettim.

        JSONObject jsonObject = null;
        try {
            try {
                jsonObject = (JSONObject) jsonParser.parse(new FileReader(jsonFile.getAbsoluteFile()));
            }catch (IOException e)
            {
                System.out.println("FileReader is not working correct , does not find the absolute path"+e.getMessage());
            }
        } catch (ParseException e) {
                System.out.println("Json File is not parsed \t:" +e.getMessage());
                throw new RuntimeException();
        }

        ObjectMapper mapper = new ObjectMapper();
        String expectedJson = mapper.writeValueAsString(jsonValid);
        Assert.assertEquals(jsonObject.toJSONString(),expectedJson);
    }
}
