public class W7P3 {
    public static void main(String[] args) {
        Person p1 = new Person("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com");
        System.out.println(p1 + "\n");

        Student st1 = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", 1);
        System.out.println(st1 + "\n");

        Employee em1 = new Employee("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", "TeeOffice", 50000.00);
        System.out.println(em1 + "\n");

        Faculty f1 = new Faculty("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", "TeeOffice", 50000.00, 8.00, "rank");
        System.out.println(f1 + "\n");

        Staff sf1 = new Staff("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", "TeeOffice", 50000.00, "Head");
        System.out.println(sf1);
    }
}