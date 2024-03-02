public class Triangle extends Shape{
    private double height,base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = (getBase()*getHeight())/2;
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circum=getBase()+getBase()+getBase();
        return circum;
    }
}
