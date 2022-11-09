package Task3;

public class Cylinder implements Shape {
    double radius;
    double high;

    public Cylinder(double radius, double high) {
        if (radius > 0 && high > 0) {
            this.radius = radius;
            this.high = high;
        } else throw new IllegalArgumentException("All parameters must be a positive numbers");
    }

    @Override
    public String volume() {
        double result=Math.PI * radius * radius * high;
        return String.format("%.2f",result);
    }

    @Override
    public String toString() {
        return "Cylinder";
    }
}
