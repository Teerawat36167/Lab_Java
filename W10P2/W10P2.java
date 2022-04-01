public class W10P2 {
	public static void main(String[] args) {
		try {
			Triangle triangle = new Triangle(1.0, 0.2, 0.5);
			System.out.println("The Triangle's area is " + triangle.getArea());
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}
	}
}