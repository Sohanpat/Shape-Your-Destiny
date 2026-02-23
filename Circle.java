/**
 * Represents a circle with a given radius.
 * Area: πr²
 * Circumference: 2πr
 */
public class Circle extends Shape {
    private double radius;
    
    /**
     * Constructs a circle with the specified radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * Gets the radius of the circle.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Calculates the area of the circle (πr²).
     * @return the area
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates the circumference of the circle (2πr).
     * @return the perimeter (circumference)
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
