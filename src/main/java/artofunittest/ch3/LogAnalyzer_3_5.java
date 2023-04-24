package artofunittest.ch3;

public class LogAnalyzer_3_5 {
    private IExtensionManager manager;

    public boolean isValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }

    public IExtensionManager getManager() {
        return manager;
    }

    public void setManager(IExtensionManager manager) {
        this.manager = manager;
    }
}
