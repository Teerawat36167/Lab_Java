public class W5P2 {
    public static void main(String[] args) {
        RegularPolygon P1 = new RegularPolygon();
        RegularPolygon P2 = new RegularPolygon(6,4);
        RegularPolygon P3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Perimeter P1 = "+P1.getPerimeter());
        System.out.println("Area P1 = "+P1.getArea());
        System.out.println("Perimeter P2 = "+P2.getPerimeter());
        System.out.println("Area P2 = "+P2.getArea());
        System.out.println("Perimeter P3 = "+P3.getPerimeter());
        System.out.println("Area P3 = "+P3.getArea());
    }
}
