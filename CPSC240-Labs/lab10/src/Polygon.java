abstract class Polygon extends Shape {
    int numOfSides;
    abstract double getPerimeter();


    public Polygon(String name){
        super(name);
        this.numOfSides=0;
    }
}
