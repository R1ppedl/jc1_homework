package part1;

public class Task24 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        // заполнение массива бабочкой с 1 и 0
        int middle = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= middle) {
                    if (j >= i && j < arr[i].length - i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                } else {
                    if (j >= arr[i].length - i - 1 && j <= i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        // вывод массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

