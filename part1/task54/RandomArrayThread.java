package part1.task54;

import java.util.Random;

class RandomArrayThread extends Thread {
    private int[] array;

    public RandomArrayThread() {
        array = new int[10];
    }

    @Override
    public void run() {
        generateRandomArray();
        int max = findMax();
        System.out.println(getName() + ": " + max);
    }

    private void generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    private int findMax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
