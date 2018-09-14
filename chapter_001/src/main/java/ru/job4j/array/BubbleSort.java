package ru.job4j.array;

/**
 * @author Emelyanov Nikita (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    public int[] bubble(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                }
            }
        }
            return data;
    }
}