package ru.job4j.max;

/**
 * @author Nikita Emelyanov (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Вывод большего из 2ух чисел
     * @param first значение
     * @param second значение
     * @return Выбор большего числа
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

}