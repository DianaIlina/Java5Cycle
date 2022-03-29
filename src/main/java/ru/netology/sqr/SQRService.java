package ru.netology.sqr;

public class SQRService {
    public int calculate(int lower, int higher) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int iSqr = i * i;
            if (iSqr >= lower && iSqr <= higher) {
                counter++;
            }
        }
        System.out.println("Количество квадратов в заданном диапазоне: " + counter);
        return counter;
    }
}

