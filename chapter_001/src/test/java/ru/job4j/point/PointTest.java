package ru.job4j.point;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distanceTo() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, 5);
        double distance = p1.distanceTo(p2);

        assertThat(distance, closeTo(4.47213595499958, 0.1));


    }


}