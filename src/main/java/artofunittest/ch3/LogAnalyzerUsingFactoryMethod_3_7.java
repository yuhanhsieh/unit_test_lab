package artofunittest.ch3;

public class LogAnalyzerUsingFactoryMethod_3_7 {

    public boolean isValidLogFileName(String fileName) {
        return getManager().isValid(fileName);
    }

    public IExtensionManager getManager() {
        return new FileExtensionManager_3_7();
    }
}
