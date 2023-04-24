package artofunittest.ch3;

public class ExtensionManagerFactory_3_6 {

    private static IExtensionManager customerManager = null;
    public static IExtensionManager create() {
        if(customerManager != null) {
            return customerManager;
        }
        return new FileExtensionManager_3_6();
    }
    public static void setManager(IExtensionManager mgr) {
        customerManager = mgr;
    }
}
