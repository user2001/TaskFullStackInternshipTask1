package Task3Test;

import Task3.Sphere;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SphereTest {

    @Test
    public void constructorSphereTest() {
        Sphere sphere = new Sphere(4.0);
        assertThat("268,08", is(sphere.volume()));
    }

    @Test
    public void constructorSphereExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Sphere(-3.2));
        assertEquals("Radius must be a positive number", exception.getMessage());
    }
}
