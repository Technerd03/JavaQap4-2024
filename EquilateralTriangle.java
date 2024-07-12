public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    
    @Override
    public String toString() {
        return "Shape: Equilateral Triangle, Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
