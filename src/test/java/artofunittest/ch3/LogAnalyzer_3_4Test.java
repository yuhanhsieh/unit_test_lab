package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_4Test {

    @Test
    public void isValidFileName_nameSupportExtension_returnsTrue() {
        FakeExtensionManager fakeManager = new FakeExtensionManager();
        fakeManager.willBeValid = true;
        LogAnalyzer_3_4 log = new LogAnalyzer_3_4(fakeManager);

        boolean result = log.isValidLogFileName("short.ext");

        Assertions.assertTrue(result);
    }

    private class FakeExtensionManager implements IExtensionManager {
        public boolean willBeValid = false;

        @Override
        public boolean isValid(String fileName) {
            return willBeValid;
        }

    }
}
