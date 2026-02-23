/**
 * Represents an isosceles right triangle, which is a special type of right triangle 
 * where both legs are equal.
 * Inherits area and perimeter calculations from RightTriangle.
 */
public class IsoscelesRightTriangle extends RightTriangle {
    
    /**
     * Constructs an isosceles right triangle with the specified leg length.
     * @param leg the length of both equal legs
     */
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);  // Both legs are equal in an isosceles right triangle
    }
    
    /**
     * Gets the leg length of the isosceles right triangle.
     * @return the leg length (both legs are equal)
     */
    public double getLeg() {
        return getLeg1();  // Since leg1 == leg2 for an isosceles right triangle
    }
    
    // Note: getArea(), getPerimeter(), and numberOfSides() are inherited from RightTriangle
    // No need to override since the RightTriangle implementations work perfectly 
    // for isosceles right triangles
}
