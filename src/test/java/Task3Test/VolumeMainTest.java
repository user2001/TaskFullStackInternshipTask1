package Task3Test;

import Task3.Cube;
import Task3.Cylinder;
import Task3.Shape;
import Task3.Sphere;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Task3.VolumeMain.sortShapes;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;



public class VolumeMainTest {

    @Test
    public void sortShapesTest() {

        List<Shape> testList = new ArrayList<>();
        Shape cube = new Cube(5.0);
        Shape cylinder = new Cylinder(5.0, 4);
        Shape sphere = new Sphere(5.0);

        Collections.addAll(testList,sphere,cylinder,cube);

        List<Shape> expected = new ArrayList<>();
        Collections.addAll(expected, cube, cylinder,sphere);

        assertIterableEquals(expected, sortShapes(testList));
    }


}
