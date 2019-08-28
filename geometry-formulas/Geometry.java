/**
 * Here are some useful Geometry formulas to demonstrate how functions can
 * return values. Also look at the Java Docs.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry {
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b length of base of parallelogram
     * @param h height of the parallelogram
     * @return area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a triange.
     *
     * @param b length of base of triangle
     * @param h height of the triangle
     * @return area of the triangle
     */
    public static double triangleArea(double base, double height) {
        double area = base * height / 2.0;

        return area;
    }

    /**
     * Computes the hypotenuse of the triangle given its legs
     *
     * @param a one side of triangle
     * @param b one side of triangle
     * @return hypotenuse of the triangle
     */
    public static double triangleHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Computes area of a trapezoid
     * 
     * @param majorBase Longer base
     * @param minorBase Thinner base
     * @param height    Height of trapezoid
     * @return Area of trapezoid
     */
    public static double trapezoidArea(double majorBase, double minorBase, double height) {
        return height * (majorBase + minorBase) / 2.0;
    }

    /**
     * Computes the volume of a sphere
     * 
     * @param radius radius of sphere
     * @return Area of sphere
     */
    public static double sphereVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Computes the surface area of a sphere
     * 
     * @param radius radius of sphere
     * @return Surface Area of sphere
     */
    public static double sphereSurfaceArea(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Computes the volume of a Rectangular Prism
     * 
     * @param length length
     * @param width  width
     * @param height Height of Rectangular Prism
     * @return Area of Rectangular Prism
     */
    public static double rectangularPrismVolume(double length, double width, double height) {
        return length * width * height;
    }

    /**
     * Computes the surface area of a Rectangular Prism
     * 
     * @param length length
     * @param width  width
     * @param height Height of Rectangular Prism
     * @return Area of Rectangular Prism
     */
    public static double rectangularPrismSurfaceArea(double length, double width, double height) {
        return 2.0 * (width * length + height * length + height * width);
    }

    /**
     * Calculates the area of a cone.
     *
     * @param radius radius of base of cone
     * @param height height of the cone
     * @return area of the cone
     */
    public static double coneVolume(double radius, double height) {
        return height / 3.0 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Computes distance between two points
     * 
     * @param x1 x parameter of 1st point
     * @param y1 y parameter of 1nd point
     * @param x2 x parameter of 2nd point
     * @param y2 y parameter of 2nd point
     * @return
     */
    public static double pointDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Computes the slope of the secant line of two points
     * 
     * @param x1 x parameter of 1st point
     * @param y1 y parameter of 1nd point
     * @param x2 x parameter of 2nd point
     * @param y2 y parameter of 2nd point
     * @return
     */
    public static double pointSlope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);

        System.out.println(ta1);
        System.out.println(ta2);

        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);

    }
}
