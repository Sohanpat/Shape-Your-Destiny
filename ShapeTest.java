/**
 * Unit tests for all shape classes.
 * Tests inheritance, polymorphism, and interface implementation.
 */
public class ShapeTest {
    
    private static final double EPSILON = 0.0001;  // Tolerance for floating point comparisons
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Shape Inheritance and Polymorphism Tests ===");
        System.out.println();
        
        // Part One Tests
        System.out.println("PART ONE: Base Shape Classes");
        System.out.println("----------------------------------------");
        testCircle();
        testParallelogram();
        testRectangle();
        testRightTriangle();
        System.out.println();
        
        // Part Two Tests
        System.out.println("PART TWO: Derived Classes (Inheritance Tree)");
        System.out.println("----------------------------------------");
        testSquare();
        testIsoscelesRightTriangle();
        System.out.println();
        
        // Part Three Tests
        System.out.println("PART THREE: Polygon Interface");
        System.out.println("----------------------------------------");
        testPolygonInterface();
        System.out.println();
        
        // Polymorphism Tests
        System.out.println("BONUS: Polymorphism Tests");
        System.out.println("----------------------------------------");
        testPolymorphism();
        System.out.println();
        
        // Summary
        System.out.println("=== Test Summary ===");
        System.out.println("Tests Passed: " + testsPassed);
        System.out.println("Tests Failed: " + testsFailed);
        System.out.println("Total Tests: " + (testsPassed + testsFailed));
        
        if (testsFailed == 0) {
            System.out.println("✓ All tests passed!");
        } else {
            System.out.println("✗ Some tests failed.");
        }
    }
    
    /**
     * Test Circle class
     */
    private static void testCircle() {
        System.out.println("Testing Circle:");
        
        Circle circle = new Circle(5.0);
        
        // Test area: πr² = π(5²) = 25π ≈ 78.5398
        double expectedArea = Math.PI * 25;
        assertEquals("Circle area", expectedArea, circle.getArea());
        
        // Test perimeter: 2πr = 2π(5) = 10π ≈ 31.4159
        double expectedPerimeter = 2 * Math.PI * 5;
        assertEquals("Circle perimeter", expectedPerimeter, circle.getPerimeter());
        
        // Test another circle
        Circle circle2 = new Circle(3.0);
        assertEquals("Circle(3) area", Math.PI * 9, circle2.getArea());
        assertEquals("Circle(3) perimeter", 6 * Math.PI, circle2.getPerimeter());
    }
    
    /**
     * Test Parallelogram class
     */
    private static void testParallelogram() {
        System.out.println("Testing Parallelogram:");
        
        Parallelogram para = new Parallelogram(6.0, 4.0, 3.0);
        
        // Test area: base × height = 6 × 3 = 18
        assertEquals("Parallelogram area", 18.0, para.getArea());
        
        // Test perimeter: 2(base + side) = 2(6 + 4) = 20
        assertEquals("Parallelogram perimeter", 20.0, para.getPerimeter());
        
        // Test number of sides
        assertEquals("Parallelogram has 4 sides", 4, para.numberOfSides());
        
        // Test another parallelogram
        Parallelogram para2 = new Parallelogram(8.0, 5.0, 4.0);
        assertEquals("Parallelogram(8,5,4) area", 32.0, para2.getArea());
        assertEquals("Parallelogram(8,5,4) perimeter", 26.0, para2.getPerimeter());
        
        // Verify inheritance
        assertTrue("Parallelogram is a Shape", para instanceof Shape);
        assertTrue("Parallelogram is a Polygon", para instanceof Polygon);
    }
    
    /**
     * Test Rectangle class
     */
    private static void testRectangle() {
        System.out.println("Testing Rectangle:");
        
        Rectangle rect = new Rectangle(4.0, 6.0);
        
        // Test area: ℓw = 4 × 6 = 24
        assertEquals("Rectangle area", 24.0, rect.getArea());
        
        // Test perimeter: 2(ℓ+w) = 2(4+6) = 20
        assertEquals("Rectangle perimeter", 20.0, rect.getPerimeter());
        
        // Test another rectangle
        Rectangle rect2 = new Rectangle(5.0, 10.0);
        assertEquals("Rectangle(5,10) area", 50.0, rect2.getArea());
        assertEquals("Rectangle(5,10) perimeter", 30.0, rect2.getPerimeter());
        
        // Verify inheritance hierarchy
        assertTrue("Rectangle is a Parallelogram", rect instanceof Parallelogram);
        assertTrue("Rectangle is a Shape", rect instanceof Shape);
        assertTrue("Rectangle is a Polygon", rect instanceof Polygon);
    }
    
    /**
     * Test RightTriangle class
     */
    private static void testRightTriangle() {
        System.out.println("Testing RightTriangle:");
        
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        
        // Test area: (1/2)ℓw = (1/2)(3)(4) = 6
        assertEquals("RightTriangle area", 6.0, triangle.getArea());
        
        // Test perimeter: ℓ + w + √(ℓ²+w²) = 3 + 4 + 5 = 12
        assertEquals("RightTriangle perimeter", 12.0, triangle.getPerimeter());
        
        // Test hypotenuse: √(3²+4²) = 5
        assertEquals("RightTriangle hypotenuse", 5.0, triangle.getHypotenuse());
        
        // Test another triangle
        RightTriangle triangle2 = new RightTriangle(5.0, 12.0);
        assertEquals("RightTriangle(5,12) area", 30.0, triangle2.getArea());
        assertEquals("RightTriangle(5,12) perimeter", 30.0, triangle2.getPerimeter());  // 5+12+13
    }
    
    /**
     * Test Square class (inherits from Rectangle)
     */
    private static void testSquare() {
        System.out.println("Testing Square:");
        
        Square square = new Square(5.0);
        
        // Test area: side² = 5² = 25
        assertEquals("Square area", 25.0, square.getArea());
        
        // Test perimeter: 4 × side = 4 × 5 = 20
        assertEquals("Square perimeter", 20.0, square.getPerimeter());
        
        // Test another square
        Square square2 = new Square(7.0);
        assertEquals("Square(7) area", 49.0, square2.getArea());
        assertEquals("Square(7) perimeter", 28.0, square2.getPerimeter());
        
        // Verify full inheritance chain
        assertTrue("Square is a Rectangle", square instanceof Rectangle);
        assertTrue("Square is a Parallelogram", square instanceof Parallelogram);
        assertTrue("Square is a Shape", square instanceof Shape);
        assertTrue("Square is a Polygon", square instanceof Polygon);
    }
    
    /**
     * Test IsoscelesRightTriangle class (inherits from RightTriangle)
     */
    private static void testIsoscelesRightTriangle() {
        System.out.println("Testing IsoscelesRightTriangle:");
        
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5.0);
        
        // Test area: (1/2)ℓ² = (1/2)(5²) = 12.5
        assertEquals("IsoscelesRightTriangle area", 12.5, triangle.getArea());
        
        // Test perimeter: 2ℓ + ℓ√2 = 10 + 5√2 ≈ 17.071
        double expectedPerimeter = 10.0 + 5.0 * Math.sqrt(2);
        assertEquals("IsoscelesRightTriangle perimeter", expectedPerimeter, triangle.getPerimeter());
        
        // Test hypotenuse: ℓ√2 = 5√2 ≈ 7.071
        double expectedHypotenuse = 5.0 * Math.sqrt(2);
        assertEquals("IsoscelesRightTriangle hypotenuse", expectedHypotenuse, triangle.getHypotenuse());
        
        // Test another triangle
        IsoscelesRightTriangle triangle2 = new IsoscelesRightTriangle(4.0);
        assertEquals("IsoscelesRightTriangle(4) area", 8.0, triangle2.getArea());
        
        // Verify inheritance
        assertTrue("IsoscelesRightTriangle is a RightTriangle", triangle instanceof RightTriangle);
        assertTrue("IsoscelesRightTriangle is a Shape", triangle instanceof Shape);
    }
    
    /**
     * Test Polygon interface implementation
     */
    private static void testPolygonInterface() {
        System.out.println("Testing Polygon Interface:");
        
        Parallelogram para = new Parallelogram(6.0, 4.0, 3.0);
        assertEquals("Parallelogram has 4 sides", 4, para.numberOfSides());
        
        Rectangle rect = new Rectangle(4.0, 6.0);
        assertEquals("Rectangle has 4 sides", 4, rect.numberOfSides());
        
        Square square = new Square(5.0);
        assertEquals("Square has 4 sides", 4, square.numberOfSides());
        
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        assertEquals("RightTriangle has 3 sides", 3, triangle.numberOfSides());
        
        IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(5.0);
        assertEquals("IsoscelesRightTriangle has 3 sides", 3, isoTriangle.numberOfSides());
        
        // Verify interface implementation
        assertTrue("Parallelogram implements Polygon", para instanceof Polygon);
        assertTrue("Rectangle implements Polygon", rect instanceof Polygon);
        assertTrue("Square implements Polygon", square instanceof Polygon);
        assertTrue("RightTriangle implements Polygon", triangle instanceof Polygon);
        assertTrue("IsoscelesRightTriangle implements Polygon", isoTriangle instanceof Polygon);
    }
    
    /**
     * Test polymorphism - treating different shapes as Shape objects
     */
    private static void testPolymorphism() {
        System.out.println("Testing Polymorphism:");
        
        // Array of different shapes, all treated as Shape
        Shape[] shapes = {
            new Circle(3.0),
            new Parallelogram(6.0, 4.0, 3.0),
            new Rectangle(4.0, 5.0),
            new Square(6.0),
            new RightTriangle(3.0, 4.0),
            new IsoscelesRightTriangle(5.0)
        };
        
        System.out.println("  Processing array of Shape objects:");
        double totalArea = 0;
        double totalPerimeter = 0;
        
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].getArea();
            totalPerimeter += shapes[i].getPerimeter();
            System.out.println("    Shape " + (i+1) + ": Area=" + 
                             String.format("%.2f", shapes[i].getArea()) + 
                             ", Perimeter=" + 
                             String.format("%.2f", shapes[i].getPerimeter()));
        }
        
        System.out.println("  Total area of all shapes: " + String.format("%.2f", totalArea));
        System.out.println("  Total perimeter of all shapes: " + String.format("%.2f", totalPerimeter));
        
        // Test Polygon polymorphism
        Polygon[] polygons = {
            new Parallelogram(6.0, 4.0, 3.0),
            new Rectangle(4.0, 5.0),
            new Square(6.0),
            new RightTriangle(3.0, 4.0),
            new IsoscelesRightTriangle(5.0)
        };
        
        System.out.println("  Processing array of Polygon objects:");
        int totalSides = 0;
        for (int i = 0; i < polygons.length; i++) {
            int sides = polygons[i].numberOfSides();
            totalSides += sides;
            System.out.println("    Polygon " + (i+1) + ": " + sides + " sides");
        }
        System.out.println("  Total sides of all polygons: " + totalSides);
        
        testsPassed++; // Count this as a passed test if no exceptions thrown
    }
    
    /**
     * Assert that two doubles are equal within EPSILON tolerance
     */
    private static void assertEquals(String testName, double expected, double actual) {
        if (Math.abs(expected - actual) < EPSILON) {
            System.out.println("  ✓ PASS: " + testName);
            testsPassed++;
        } else {
            System.out.println("  ✗ FAIL: " + testName);
            System.out.println("    Expected: " + expected);
            System.out.println("    Got: " + actual);
            testsFailed++;
        }
    }
    
    /**
     * Assert that two integers are equal
     */
    private static void assertEquals(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println("  ✓ PASS: " + testName);
            testsPassed++;
        } else {
            System.out.println("  ✗ FAIL: " + testName);
            System.out.println("    Expected: " + expected);
            System.out.println("    Got: " + actual);
            testsFailed++;
        }
    }
    
    /**
     * Assert that a condition is true
     */
    private static void assertTrue(String testName, boolean condition) {
        if (condition) {
            System.out.println("  ✓ PASS: " + testName);
            testsPassed++;
        } else {
            System.out.println("  ✗ FAIL: " + testName);
            testsFailed++;
        }
    }
}
