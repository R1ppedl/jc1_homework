package part1.Task46;

import part1.Task46.CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Исключение обработано на уровне выше.");
        }
    }

    public static void throwException() throws CustomException {
        throw new CustomException("Это пользовательское исключение.");
    }
}
