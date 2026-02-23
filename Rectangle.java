/**
 * Represents a rectangle with length and width.
 * A rectangle is a special type of parallelogram where all angles are 90 degrees.
 * Area: ℓw
 * Perimeter: 2(ℓ+w)
 */
public class Rectangle extends Parallelogram {
    private double length;
    private double width;
    
    /**
     * Constructs a rectangle with the specified length and width.
     * For a rectangle, the base = length, side = width, and height = width
     * (since the sides are perpendicular to the base).
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double length, double width) {
        super(length, width, width);  // base, side, height
        this.length = length;
        this.width = width;
    }
    
    /**
     * Gets the length of the rectangle.
     * @return the length
     */
    public double getLength() {
        return length;
    }
    
    /**
     * Gets the width of the rectangle.
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * Calculates the area of the rectangle (ℓw).
     * Overrides Parallelogram's area formula since for rectangles,
     * area = length × width (which equals base × height).
     * @return the area
     */
    @Override
    public double getArea() {
        return length * width;
    }
    
    /**
     * Calculates the perimeter of the rectangle (2(ℓ+w)).
     * Inherits from Parallelogram since 2(base + side) = 2(length + width).
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    /**
     * Returns the number of sides in a rectangle.
     * Inherits from Parallelogram (4 sides).
     * @return 4 (rectangles have 4 sides)
     */
    @Override
    public int numberOfSides() {
        return 4;
    }
}
