package artofunittest.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_2_1Test {

    @Test
    public void isValidFileName_badExtension_returnFalse() {
        LogAnalyzer_2_1 analyzer = new LogAnalyzer_2_1();
        boolean result = analyzer.isValidLogFileName("filewithbadextension.slf");
        Assertions.assertTrue(result);
    }

    @Test
    public void isValidLogFileName_goodExtensionUppercase_returnsTrue() {
        LogAnalyzer_2_1 analyzer = new LogAnalyzer_2_1();
        boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");
        Assertions.assertTrue(result);
    }
}
