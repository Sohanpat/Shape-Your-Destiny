/**
 * Represents a square, which is a special type of rectangle where all sides are equal.
 * Inherits area and perimeter calculations from Rectangle.
 */
public class Square extends Rectangle {
    
    /**
     * Constructs a square with the specified side length.
     * @param side the length of each side of the square
     */
    public Square(double side) {
        super(side, side);  // A square is a rectangle with equal length and width
    }
    
    /**
     * Gets the side length of the square.
     * @return the side length
     */
    public double getSide() {
        return getLength();  // Since length == width for a square
    }
    
    // Note: getArea(), getPerimeter(), and numberOfSides() are inherited from Rectangle
    // No need to override since the Rectangle implementations work perfectly for squares
}
