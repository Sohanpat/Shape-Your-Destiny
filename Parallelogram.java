/**
 * Represents a parallelogram with base, side, and height.
 * A parallelogram is a quadrilateral with opposite sides parallel.
 * 
 * Area: base × height
 * Perimeter: 2(base + side)
 */
public class Parallelogram extends Shape implements Polygon {
    private double base;
    private double side;
    private double height;
    
    /**
     * Constructs a parallelogram with the specified dimensions.
     * @param base the length of the base
     * @param side the length of the side
     * @param height the perpendicular height from base to opposite side
     */
    public Parallelogram(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }
    
    /**
     * Gets the base of the parallelogram.
     * @return the base
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Gets the side length of the parallelogram.
     * @return the side
     */
    public double getSide() {
        return side;
    }
    
    /**
     * Gets the height of the parallelogram.
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Calculates the area of the parallelogram (base × height).
     * @return the area
     */
    @Override
    public double getArea() {
        return base * height;
    }
    
    /**
     * Calculates the perimeter of the parallelogram (2(base + side)).
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (base + side);
    }
    
    /**
     * Returns the number of sides in a parallelogram.
     * @return 4 (parallelograms have 4 sides)
     */
    @Override
    public int numberOfSides() {
        return 4;
    }
}
