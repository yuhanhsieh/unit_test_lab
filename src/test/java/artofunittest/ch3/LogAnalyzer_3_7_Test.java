package artofunittest.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzer_3_7_Test {
    @Test
    public void overrideTest() {
        FakeExtensionManager stub = new FakeExtensionManager();
        stub.willBeValid = true;

        // TestableLogAnalyzer inherits the class under test
        TestableLogAnalyzer logan = new TestableLogAnalyzer(stub);
        boolean result = logan.isValidLogFileName("file.ext");

        Assertions.assertTrue(result);
    }

    class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod_3_7 {
        public IExtensionManager manager;

        public TestableLogAnalyzer(IExtensionManager mgr) {
            this.manager = mgr;
        }
        @Override
        public IExtensionManager getManager() {
            return manager;
        }
    }

    class FakeExtensionManager implements IExtensionManager {

        public boolean willBeValid = false;

        @Override
        public boolean isValid(String fileName) {
            return willBeValid;
        }
    }
}
