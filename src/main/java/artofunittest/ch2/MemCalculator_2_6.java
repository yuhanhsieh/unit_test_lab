package artofunittest.ch2;

public class MemCalculator_2_6 {

    private int sum = 0;

    public void add(int number) {
        sum += number;
    }

    public int sum() {
        int temp = sum;
        sum = 0;
        return temp;
    }
}
