public class W8P2 {
    public static void main(String[] args) {
        GeometricObjectP2[] square = {new Square(5, "Red", true),new Square(4, "White", true),new Square(9, "Gray", true),new Square(1, "Green", true),new Square(2, "Yellow", true)};
        for (int i = 0; i < square.length; i++) {
            System.out.println(square[i]);
            ((Square)square[i]).howToColor();
            System.out.println();
        }
    }
}