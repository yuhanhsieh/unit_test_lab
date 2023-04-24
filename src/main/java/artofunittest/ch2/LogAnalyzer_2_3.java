package artofunittest.ch2;

public class LogAnalyzer_2_3 {
    public boolean isValidLogFileName(String fileName) {

        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("filename has to be provided");
        }

        if (!(fileName.endsWith(".SLF") || fileName.endsWith(".slf"))) {
            return false;
        }
        return true;
    }
}