public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }


    // Abstract method to compute the perimeter of the shape
    public abstract double computePerimeter();


    // Abstract method to compute the area of the shape
    public abstract double computeArea();

    
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}