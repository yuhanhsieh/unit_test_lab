package artofunittest.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LogAnalyzer_2_5Test {

    @ParameterizedTest
    @CsvSource({"badfile.foo, false", "goodfile.slf, true"})
    public void isValidFileName_whenCalled_changesWasLastFileNameValid(String filename, boolean expected) {
        LogAnalyzer_2_4 la = makeAnalyzer();
        la.isValidLogFileName(filename);
        Assertions.assertEquals(expected, la.wasLastFileNameValid);
    }

    private LogAnalyzer_2_4 makeAnalyzer() {
        return new LogAnalyzer_2_4();
    }
}
