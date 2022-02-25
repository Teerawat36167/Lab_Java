public class W8P4 {
    public static void main(String[] args) throws Exception{
        Octagon test = new Octagon(5);
        Octagon test2;
        System.out.println(test);
        test2 = test.clone();
        System.out.println("\nClone Octagon");
        System.out.println(test2);
    }
}