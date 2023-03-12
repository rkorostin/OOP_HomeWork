package HomeWork.Task3_review;

public class Circle extends Figure {
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    
}
