public class Circle extends Shape{
   private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area=(getRadius()*getRadius())*Math.PI;
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circum=Math.PI*2*getRadius();
        return circum;
    }
}
