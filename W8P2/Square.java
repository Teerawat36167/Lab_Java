public class Square extends GeometricObjectP2 implements Colorable {
    private double s;

    public Square() {
        super();
    }

    public Square(double s) {
        super();
        this.s = s;
    }

    public Square(double s,String color,Boolean filled) {
        super(color, filled);
        this.s = s;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return s*s;
    }

    @Override
    public double getPerimeter() {
        return s;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Perimeter = " + getPerimeter() + "\n" +
        "Area = " + getArea();
    }
}
