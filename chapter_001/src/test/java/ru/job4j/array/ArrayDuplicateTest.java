package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import java.util.Arrays;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] except = {"Привет", "Мир", "Супер"};
        ArrayDuplicate duplacate = new ArrayDuplicate();
        String[] result = duplacate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}