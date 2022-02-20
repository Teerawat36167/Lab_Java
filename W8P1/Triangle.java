import java.lang.Math;

public class Triangle {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // Constructor

    public Triangle() {

    }

    public Triangle(int n,double side) {
        this.n = n;
        this.side = side;
    }

    public Triangle(int n,double side,double x,double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Method

    public int accessorN() {
        return this.n;
    }

    public double accessorSide() {
        return this.side;
    }

    public double accessorX() {
        return x;
    }

    public double accessorY() {
        return y;
    }

    public void mutatorN(int n) {
        this.n = n;
    }

    public void mutatorSide(double side) {
        this.side = side;
    }

    public void mutatorX(double x) {
        this.x = x;
    }

    public void mutatorY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n*side;
    }

    public double getArea() {
        return (n*(side*side))/(4*Math.tan(Math.PI/n));
    }
}
