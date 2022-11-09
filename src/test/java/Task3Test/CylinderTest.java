package Task3Test;

import Task3.Cylinder;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {

    @Test
    public void constructorCylinderTest() {
        Cylinder cylinder = new Cylinder(4.0, 5);
        assertThat("251,33", is(cylinder.volume()));
    }

    @Test
    public void constructorCylinderExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Cylinder(-5.2, 6));
        assertEquals("All parameters must be a positive numbers", exception.getMessage());
    }

}
