/**
 * Represents a right triangle with two legs.
 * Area: (1/2)ℓw
 * Perimeter: ℓ + w + √(ℓ² + w²)
 */
public class RightTriangle extends Shape implements Polygon {
    private double leg1;
    private double leg2;
    
    /**
     * Constructs a right triangle with the specified legs.
     * @param leg1 the first leg of the triangle
     * @param leg2 the second leg of the triangle
     */
    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }
    
    /**
     * Gets the first leg of the triangle.
     * @return the first leg
     */
    public double getLeg1() {
        return leg1;
    }
    
    /**
     * Gets the second leg of the triangle.
     * @return the second leg
     */
    public double getLeg2() {
        return leg2;
    }
    
    /**
     * Calculates the hypotenuse of the right triangle.
     * @return the hypotenuse
     */
    public double getHypotenuse() {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }
    
    /**
     * Calculates the area of the right triangle ((1/2)ℓw).
     * @return the area
     */
    @Override
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }
    
    /**
     * Calculates the perimeter of the right triangle (ℓ + w + hypotenuse).
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return leg1 + leg2 + getHypotenuse();
    }
    
    /**
     * Returns the number of sides in a triangle.
     * @return 3 (triangles have 3 sides)
     */
    @Override
    public int numberOfSides() {
        return 3;
    }
}
