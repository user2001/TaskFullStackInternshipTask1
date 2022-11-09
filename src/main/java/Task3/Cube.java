package Task3;

public class Cube implements Shape {
    double side;

    public Cube(double side) {
        if (side > 0) {
            this.side = side;
        } else throw new IllegalArgumentException("Side should be a positive number");
    }

    @Override
    public String volume() {
        double volume = Math.pow(side, 3);
        return String.format("%.2f", volume);
    }

    @Override
    public String toString() {
        return "Cube";
    }
}
