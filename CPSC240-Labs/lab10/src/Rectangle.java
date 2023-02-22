public class Rectangle extends Polygon{

    double sideA;
    double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double getArea(){
        double area;
        area=this.sideA*this.sideB;
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter=(2*this.sideA)+(2*this.sideB);
        return perimeter;
    }
}
