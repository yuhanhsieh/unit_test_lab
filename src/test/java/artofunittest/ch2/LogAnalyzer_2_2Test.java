package artofunittest.ch2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_2_2Test {

    private LogAnalyzer_2_2 analyzer = null;

    @BeforeEach
    public void setup() {
        analyzer = new LogAnalyzer_2_2();
    }

    @Test
    public void isValidFileName_validFileLowerCased_returnsTrue() {
        boolean result = analyzer.isValidLogFileName("whatever.slf");

        Assertions.assertTrue(result, "filename should be valid!");
    }

    @Test
    public void isValidLogFileName_validFileUpperCased_returnTrue() {
        LogAnalyzer_2_2 analyzer = new LogAnalyzer_2_2();
        boolean result = analyzer.isValidLogFileName("whatever.SLF");
        Assertions.assertTrue(result, "filename should be valid!");
    }

    @AfterEach
    public void cleanup() {
        // 實務上不需要如此做
        analyzer = null;
    }
}
