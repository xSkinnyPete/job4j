package ru.job4j.point;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distanceTo() {
        Point point = new Point();
        double result = point.distanceTo(a, b);
        assertThat(result, closeTo(4.47213595499958, 0.1));


    }


}