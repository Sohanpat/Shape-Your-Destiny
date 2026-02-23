/**
 * Abstract base class representing a geometric shape.
 * All shapes must be able to calculate their area and perimeter.
 */
public abstract class Shape {
    
    /**
     * Calculates the area of the shape.
     * @return the area of the shape
     */
    public abstract double getArea();
    
    /**
     * Calculates the perimeter of the shape.
     * @return the perimeter of the shape
     */
    public abstract double getPerimeter();
}
