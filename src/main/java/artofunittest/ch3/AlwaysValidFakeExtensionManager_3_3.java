package artofunittest.ch3;

public class AlwaysValidFakeExtensionManager_3_3 implements IExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        return true;
    }
}