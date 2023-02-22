import java.lang.Math.*;
public class Circle extends Shape{
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius=radius;
    }

    public double getArea(){
        double area;
        double rad = this.radius;
        area= Math.PI*rad*rad;
        return area;
    }

    public double getCircumference(){
        double circ;
        double rad = this.radius;
        circ= Math.PI*2*rad;
        return circ;
    }
}