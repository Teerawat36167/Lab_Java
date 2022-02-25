public class W8P3 {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(5.0,10.0,"Red",true);
        Rectangle test2 = new Rectangle(2.0,12.0,"White",true);
        System.out.println(test);
        System.out.println(test.compareTo(test2));
        System.out.println(test.equals(test2));
    }
}
