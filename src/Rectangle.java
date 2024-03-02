public class Rectangle extends Shape{
    private double height,width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area=getWidth()*getHeight();
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circum=2*(getHeight()+getWidth());
        return circum;
    }
}
