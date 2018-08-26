package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikita Emelyanov (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     * Test Add
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test Sub
     */
    @Test
    public void whenSubtractFiveSubTwoThenThree() {
	Calculator calc = new Calculator();
	calc.subtract(5D, 2D);
	double result = calc.getResult();
	double expected = 3D;
	assertThat(result, is(expected));
    }

    /**
     * Test Div
     */
    @Test
    public void whenDivisionSixDivTwoThenThree() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**
     * Test Multiple
     */
    @Test
    public void whenMultipleFourMultTwoThenEight() {
	Calculator calc = new Calculator();
	calc.multiple(4D, 2D);
	double result = calc.getResult();
	double expected = 8D;
	assertThat(result, is(expected));
    }
}