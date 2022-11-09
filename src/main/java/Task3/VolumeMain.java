package Task3;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class VolumeMain {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        Collections.addAll(shapeList,
                new Cube(5.0),
                new Cylinder(5.0, 4.0),
                new Sphere(5.0));

        sortShapes(shapeList);
    }

    /**
     * Method takes list of shapes and sorts them by their volume
     *
     * @param shapeList
     */
    public static List<Shape> sortShapes(List<Shape> shapeList) {
        Map<String, Shape> toMap = shapeList.stream()
                .collect(Collectors.toMap(Shape::volume, Function.identity()));
        Map<String, Shape> sortMap = new TreeMap<>(toMap);
        System.out.println(sortMap);
        List<Shape> listResult = new ArrayList<>(sortMap.values());
        System.out.println(listResult);
        return listResult;
    }

}
