package artofunittest.ch3;

public class LogAnalyzerUsingFactoryMethod_3_8 {

    public boolean isValidLogFileName(String fileName) {
        return this.isValid(fileName);
    }

    protected boolean isValid(String fileName) {
        FileExtensionManager_3_8 mgr = new FileExtensionManager_3_8();
        return mgr.isValid(fileName);
    }
}
