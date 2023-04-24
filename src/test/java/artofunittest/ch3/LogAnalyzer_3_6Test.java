package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_6Test {

    @Test
    public void isValidFileName_supportedExtension_returnsTrue() {
        // set up the stub to use, make sure it returns true.
        IExtensionManager myFakeManager = new FakeExtensionManager3_6();
        ExtensionManagerFactory_3_6.setManager(myFakeManager);
        LogAnalyzer_3_6 log = new LogAnalyzer_3_6();

        // assert logic assuming extension is supported.
        boolean result = log.isValidLogFileName("Harry Potter.SLF");

        Assertions.assertTrue(result);
    }

    class FakeExtensionManager3_6 implements IExtensionManager {
        @Override
        public boolean isValid(String fileName) {
            return true;
        }
    }
}