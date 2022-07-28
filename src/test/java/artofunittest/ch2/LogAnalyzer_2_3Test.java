package artofunittest.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_2_3Test {

    @Test
    public void exception_cached_messageCorrect() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LogAnalyzer_2_3 analyzer = new LogAnalyzer_2_3();
            analyzer.isValidLogFileName(null);
        });

        Assertions.assertEquals("filename has to be provided", exception.getMessage());
    }

}
