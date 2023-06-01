package part1.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class AverageCalculator implements Callable<Double> {
    private List<Integer> numbers;

    public AverageCalculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Double call() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }


}

