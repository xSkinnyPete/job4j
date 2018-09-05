package ru.job4j.summ;

/**
 * @author Nikita Emelyanov (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     *
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
        }
    }