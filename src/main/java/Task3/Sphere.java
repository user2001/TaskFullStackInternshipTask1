package Task3;

public class Sphere implements Shape {
    double radiusSphere;

    public Sphere(double radiusSphere) {
        if (radiusSphere > 0) {
            this.radiusSphere = radiusSphere;
        } else throw new IllegalArgumentException("Radius must be a positive number");
    }

    @Override
    public String volume() {
        double result = 4 * Math.PI * Math.pow(radiusSphere, 3) / 3;
        return String.format("%.2f", result);
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
