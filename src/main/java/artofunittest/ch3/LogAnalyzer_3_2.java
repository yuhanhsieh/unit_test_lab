package artofunittest.ch3;

public class LogAnalyzer_3_2 {

    public boolean isValidLogFileName(String fileName) {

        IExtensionManager mgr = new FileExtensionManager_3_2();

        return mgr.isValid(fileName);
    }
}
