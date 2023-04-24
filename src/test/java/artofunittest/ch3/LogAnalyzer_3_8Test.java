package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_8Test {
    @Test
    public void overrideTestWithoutStub() {
        TestableLogAnalyzer logan = new TestableLogAnalyzer();
        logan.isSupported = true;

        boolean result = logan.isValidLogFileName("file.ext");

        Assertions.assertTrue(result);
    }

    class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod_3_8 {
        public boolean isSupported;

        @Override
        protected boolean isValid(String fileName) {
            return isSupported;
        }
    }
}
