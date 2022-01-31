public class W6P2 {
    public static void main(String[] args) {
        Course S1 = new Course("Math");
        S1.addStudent("Tee");
        S1.addStudent("Teerawat");
        S1.addStudent("Teeeee");
        S1.dropStudent("Teerawat");
        for (String students : S1.getStudents()) {
            if (students == null) {
                break;
            }
            System.out.println(students);
        }
    }
}