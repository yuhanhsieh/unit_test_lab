package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_5Test {

    @Test
    public void isValidFileName_supportedExtension_returnsTrue() {
        // setup the stub to use, make sure it returns true
        IExtensionManager fakeManager = new FileExtensionManager_3_5();

        // create analyzer and inject stub
        LogAnalyzer_3_5 log = new LogAnalyzer_3_5();
        log.setManager(fakeManager);

        boolean result = log.isValidLogFileName("Harry Potter.SLF");

        Assertions.assertTrue(result);
    }
}
