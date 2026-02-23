/**
 * Driver program demonstrating shape inheritance and polymorphism.
 */
public class ShapeDriver {
    
    public static void main(String[] args) {
        System.out.println("=== Shape Demonstration Program ===");
        System.out.println();
        
        // Demonstrate Circle
        System.out.println("CIRCLE:");
        Circle circle = new Circle(5.0);
        System.out.println("  Radius: " + circle.getRadius());
        System.out.println("  Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("  Circumference: " + String.format("%.2f", circle.getPerimeter()));
        System.out.println();
        
        // Demonstrate Parallelogram
        System.out.println("PARALLELOGRAM:");
        Parallelogram parallelogram = new Parallelogram(6.0, 4.0, 3.0);
        System.out.println("  Base: " + parallelogram.getBase());
        System.out.println("  Side: " + parallelogram.getSide());
        System.out.println("  Height: " + parallelogram.getHeight());
        System.out.println("  Area: " + String.format("%.2f", parallelogram.getArea()));
        System.out.println("  Perimeter: " + String.format("%.2f", parallelogram.getPerimeter()));
        System.out.println("  Number of sides: " + parallelogram.numberOfSides());
        System.out.println();
        
        // Demonstrate Rectangle
        System.out.println("RECTANGLE:");
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("  Length: " + rectangle.getLength());
        System.out.println("  Width: " + rectangle.getWidth());
        System.out.println("  Area: " + String.format("%.2f", rectangle.getArea()));
        System.out.println("  Perimeter: " + String.format("%.2f", rectangle.getPerimeter()));
        System.out.println("  Number of sides: " + rectangle.numberOfSides());
        System.out.println("  Is a Parallelogram? " + (rectangle instanceof Parallelogram));
        System.out.println();
        
        // Demonstrate Square
        System.out.println("SQUARE:");
        Square square = new Square(5.0);
        System.out.println("  Side: " + square.getSide());
        System.out.println("  Area: " + String.format("%.2f", square.getArea()));
        System.out.println("  Perimeter: " + String.format("%.2f", square.getPerimeter()));
        System.out.println("  Number of sides: " + square.numberOfSides());
        System.out.println("  Is a Rectangle? " + (square instanceof Rectangle));
        System.out.println("  Is a Parallelogram? " + (square instanceof Parallelogram));
        System.out.println();
        
        // Demonstrate RightTriangle
        System.out.println("RIGHT TRIANGLE:");
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        System.out.println("  Leg 1: " + triangle.getLeg1());
        System.out.println("  Leg 2: " + triangle.getLeg2());
        System.out.println("  Hypotenuse: " + String.format("%.2f", triangle.getHypotenuse()));
        System.out.println("  Area: " + String.format("%.2f", triangle.getArea()));
        System.out.println("  Perimeter: " + String.format("%.2f", triangle.getPerimeter()));
        System.out.println("  Number of sides: " + triangle.numberOfSides());
        System.out.println();
        
        // Demonstrate IsoscelesRightTriangle
        System.out.println("ISOSCELES RIGHT TRIANGLE:");
        IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(5.0);
        System.out.println("  Leg: " + isoTriangle.getLeg());
        System.out.println("  Hypotenuse: " + String.format("%.2f", isoTriangle.getHypotenuse()));
        System.out.println("  Area: " + String.format("%.2f", isoTriangle.getArea()));
        System.out.println("  Perimeter: " + String.format("%.2f", isoTriangle.getPerimeter()));
        System.out.println("  Number of sides: " + isoTriangle.numberOfSides());
        System.out.println("  Is a RightTriangle? " + (isoTriangle instanceof RightTriangle));
        System.out.println();
        
        // Demonstrate polymorphism
        System.out.println("POLYMORPHISM DEMONSTRATION:");
        System.out.println("Treating all shapes as Shape objects:");
        Shape[] shapes = {circle, parallelogram, rectangle, square, triangle, isoTriangle};
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("  Shape " + (i+1) + ": " + 
                             shapes[i].getClass().getSimpleName() + 
                             " - Area: " + String.format("%.2f", shapes[i].getArea()) +
                             ", Perimeter: " + String.format("%.2f", shapes[i].getPerimeter()));
        }
        System.out.println();
        
        // Demonstrate Polygon interface
        System.out.println("POLYGON INTERFACE DEMONSTRATION:");
        System.out.println("All polygons and their sides:");
        Polygon[] polygons = {parallelogram, rectangle, square, triangle, isoTriangle};
        
        for (int i = 0; i < polygons.length; i++) {
            System.out.println("  " + polygons[i].getClass().getSimpleName() + 
                             " has " + polygons[i].numberOfSides() + " sides");
        }
    }
}
