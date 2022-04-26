public class Course {

    // equals 
    
    private String courseName; 
    private String[] students = new String[100];
    private int numberOfStudents=0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length+1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public void dropStudent(String student) {
        for (int index = 0; index < students.length; index++) {
            if (student.equals(students[index])) {
                System.arraycopy(students, index+1, students, index, (students.length-index)-1);
                students[numberOfStudents] = null;
                numberOfStudents--;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }
}
