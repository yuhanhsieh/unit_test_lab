package artofunittest.ch1;

public class SimpleParser {
    public int parseAndSum(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        }
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            throw new RuntimeException();
        }
    }
}
