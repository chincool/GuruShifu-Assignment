package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        assertThat(new Rectangle(6,4).calculateArea(),is(equalTo(24)));
    }

}