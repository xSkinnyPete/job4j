package ru.job4j.factorial;

import org.junit.Test;

import javax.xml.ws.soap.Addressing;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorial() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(6);
        assertThat(result, is(720));
    }
}
