package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_4_4Test {

    @Test
    public void isValidFileName_extManagerThrowsException_returnFalse() {
        FakeExtensionManager fakeExtensionManager = new FakeExtensionManager();
        fakeExtensionManager.willThrow = new RuntimeException("this is fake");
        LogAnalyzer_3_4 log = new LogAnalyzer_3_4(fakeExtensionManager);

        boolean result = log.isValidLogFileName("anything.anyextension");

        Assertions.assertFalse(result);
    }

    class FakeExtensionManager implements IExtensionManager {
        public boolean willBeValid = false;
        public RuntimeException willThrow = null;
        @Override
        public boolean isValid(String fileName) {
            if (willThrow != null) {
                throw willThrow;
            }
            return willBeValid;
        }
    }
}
