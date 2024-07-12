public class Demo {
    public static void main(String[] args) {
        // Create an array of different shapes
        Shape[] shapes = {
            new Circle(5),
            new Ellipse(6, 4),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(4)
        };


        // Print shapes before scaling
        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }


        // Scale shapes by a factor of 2
        scaleShapes(shapes, 2);


        // Print shapes after scaling
        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    
    // Method to scale an array of shapes
    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            shape.scale(factor);
        }
    }
}
