package artofunittest.ch2;

public class LogAnalyzer_2_1 {
    public boolean isValidLogFileName(String fileName) {
        if (!(fileName.endsWith(".SLF") || fileName.endsWith(".slf"))) {
            return false;
        }
        return true;
    }
}