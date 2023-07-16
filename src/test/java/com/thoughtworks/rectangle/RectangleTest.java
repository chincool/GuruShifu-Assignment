package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(6.1,4.2);
        double area = rectangle.area();
        assertThat(area,is(closeTo(25.62,0.001)));
    }

    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(6.2,4.1);
        double perimeter = rectangle.perimeter();
        assertThat(perimeter,is(closeTo(20.6,0.001)));
    }

}