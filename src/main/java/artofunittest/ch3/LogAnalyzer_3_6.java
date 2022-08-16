package artofunittest.ch3;

public class LogAnalyzer_3_6 {

    private IExtensionManager manager;

    public LogAnalyzer_3_6() {
        manager = ExtensionManagerFactory_3_6.create();
    }

    public boolean isValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }


}
