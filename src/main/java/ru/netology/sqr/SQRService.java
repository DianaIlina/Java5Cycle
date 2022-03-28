package ru.netology.sqr;

public class SQRService {
    public int calculate(int lower, int higher) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int sqr_i = i * i;
            if (sqr_i >= lower) {
                if (sqr_i <= higher) {
                    counter++;
                } else {
                    System.out.println("Количество квадратов в заданном диапазоне: " + counter);
                    return counter;
                }
            }
        }
        System.out.println("Количество квадратов в заданном диапазоне: " + counter);
        return counter;
    }
}

