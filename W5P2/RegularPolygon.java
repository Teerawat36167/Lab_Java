public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n,double side) {
        this.n = n;
        this.side = side;
    }

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
}
