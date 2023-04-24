package artofunittest.ch3;

public class LogAnalyzer_3_1 {

    public boolean isValidLogFileName(String fileName) {

        FileExtensionManager_3_1 mgr = new FileExtensionManager_3_1();

        return mgr.isValid(fileName);
    }
}
