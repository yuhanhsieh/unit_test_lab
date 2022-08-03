package artofunittest;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Run all Test")
@SelectPackages({"artofunittest.ch2", "artofunittest.ch3"})
@IncludeClassNamePatterns(".*Test")
public class AllTest {
}
