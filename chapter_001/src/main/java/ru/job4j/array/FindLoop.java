package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int e1) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == e1) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}