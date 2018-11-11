package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                    result = false;
                    break;
                }
            if (data[0][0] != data[i][data[i].length - 1 - i]) {
                    result = false;
                    break;
            }
        }
        return result;
    }
}