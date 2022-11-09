package Task3Test;

import Task3.Cube;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CubeTest {

    @Test
    public void constructorCubeTest() {
        Cube cube = new Cube(4.0);
        assertThat("64,00", is(cube.volume()));
    }

    @Test
    public void constructorCubeExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Cube(-5.2));
        assertEquals("Side should be a positive number", exception.getMessage());
    }
}
