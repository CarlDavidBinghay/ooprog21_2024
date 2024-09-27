public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        calculateDiameter();
        calculateArea();
    }

   
    private void calculateDiameter() {
        this.diameter = 2 * radius;
    }


    private void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

   
    public void setRadius(double rad) {
        this.radius = rad;
        calculateDiameter();
        calculateArea();
    }

    public double getRadius() {
        return radius;
    }


    public double getDiameter() {
        return diameter;
    }

    
    public double getArea() {
        return area;
    }

   
    public static void main(String[] args) {
        Circle circle = new Circle(); 
        System.out.println("Default Radius: " + circle.getRadius());
        System.out.println("Default Diameter: " + circle.getDiameter());
        System.out.println("Default Area: " + circle.getArea());

       
        circle.setRadius(5);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Diameter: " + circle.getDiameter());
        System.out.println("Updated Area: " + circle.getArea());
    }
}