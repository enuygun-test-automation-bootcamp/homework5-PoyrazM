package devices;

// DeviceFarm classında sanal mobil cihazımın config özellikleri tanımlanan json dosyası için bir path oluşturulmuştur
public enum DeviceFarm {
    ANDROID_OREO("src/test/resources/capabilities/android-oreo.json");

    public String path;
    DeviceFarm(String path){
        this.path = path;
    }
}
