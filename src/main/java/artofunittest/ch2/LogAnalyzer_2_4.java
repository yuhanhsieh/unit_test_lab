package artofunittest.ch2;

public class LogAnalyzer_2_4 {
    public boolean wasLastFileNameValid;

    public boolean isValidLogFileName(String fileName) {
        wasLastFileNameValid = false;
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("filename has to be provided");
        }
        if (!(fileName.endsWith(".SLF") || fileName.endsWith(".slf"))) {
            return false;
        }
        wasLastFileNameValid = true;
        return true;
    }

    public boolean isWasLastFileNameValid() {
        return wasLastFileNameValid;
    }

    public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
        this.wasLastFileNameValid = wasLastFileNameValid;
    }
}
