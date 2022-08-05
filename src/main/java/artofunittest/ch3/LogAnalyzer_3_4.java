package artofunittest.ch3;

public class LogAnalyzer_3_4 {

    private IExtensionManager manager;

    public LogAnalyzer_3_4(IExtensionManager manager) {
        this.manager = manager;
    }

    public boolean isValidLogFileName(String fileName) {
        boolean result = true;
        try {
            manager.isValid(fileName);
        } catch (RuntimeException re) {
            result = false;
        }
        return result;
    }
}