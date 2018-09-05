package ru.job4j.factorial;

/**
 * @author Nikita Emelyanov (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}