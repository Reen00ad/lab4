public class Main {
    public static void main(String[] args) {

          Circle c1=new Circle(3);
          System.out.println("Area of circle : "+c1.calculateArea());
          System.out.println("Circumference of circle : "+c1.calculateCircumference());

          Triangle t1=new Triangle(10,20);
           System.out.println("Area of triangle : "+t1.calculateArea());
           System.out.println("Circumference of triangle : "+t1

                   .calculateCircumference());

          Rectangle r1=new Rectangle(4,5);
          System.out.println("Area of rectangel : "+r1.calculateArea());
          System.out.println("Circumference of rectangle : "+r1.calculateCircumference());
    }
}