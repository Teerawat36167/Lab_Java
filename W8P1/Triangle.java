import java.lang.Math;

public class Triangle extends GeometricObject{
    private double s1,s2,s3;
    
    public Triangle() {
        super();
    }

    public Triangle(double s1,double s2,double s3) {
        super();
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(double s1,double s2,double s3,String color,Boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return this.s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return this.s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return this.s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt((s*(s-s1)) * (s-s2) * (s-s3));
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Perimeter = " + getPerimeter() + "\n" +
                "Area = " + getArea();
    }
}
