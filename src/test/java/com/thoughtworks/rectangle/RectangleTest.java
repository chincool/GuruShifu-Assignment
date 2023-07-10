package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void calculateAreaWhenLengthIsSixAndBreadthIsFour() {
        assertEquals(new Rectangle(6,4).calculateArea(),24, "The Area Of Triangle with l=6  and b=4 should be 24");
    }

}