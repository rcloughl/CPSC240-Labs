public class Triangle extends Polygon{

    double sideA;
    double sideB;
    double base;
    double height;

    public Triangle(String name,double base, double height, double sideA, double sideB) {
        super(name);
        this.sideA=sideA;
        this.sideB=sideB;
        this.base=base;
        this.height=height;
    }

    public double getArea(){
        double area;
        area=this.height*this.base*.5;
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter=this.sideA+this.sideB+this.base;
        return perimeter;
    }
}
