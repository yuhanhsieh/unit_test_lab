package artofunittest.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzerTest {

    @Test
    public void isValidFileName_badExtension_returnFalse() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("filewithbadextension.foo");
        Assertions.assertTrue(result);
    }
}
