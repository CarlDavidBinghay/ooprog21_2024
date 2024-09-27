public class TestCircle {

    public static void main(String[] args) {
        
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

 
        a.setRadius(3);

        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

   
        b.setRadius(20);
        
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}

class Circle {
    private double radius;


    public Circle() {
        radius = 1.0; 
    }

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    
    public double getDiameter() {
        return 2 * radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}