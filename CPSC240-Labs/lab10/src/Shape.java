abstract class Shape {
    String name;

    abstract double getArea();

    public void display(){
        System.out.println(this.name + " (" + this.getArea() + ")");
    }


    public Shape(String name) {
        this.name = name;
    }
}