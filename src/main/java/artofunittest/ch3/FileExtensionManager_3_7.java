package artofunittest.ch3;

public class FileExtensionManager_3_7 implements IExtensionManager {

    @Override
    public boolean isValid(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("filename has to be provided");
        }

        if (!(fileName.endsWith(".SLF") || fileName.endsWith(".slf"))) {
            return false;
        }
        return true;
    }
}
