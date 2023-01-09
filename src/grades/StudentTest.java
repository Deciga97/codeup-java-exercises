package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);
        System.out.println("Student 1 average: " + student1.getGradeAverage());

        Student student2 = new Student("Jane");
        student2.addGrade(95);
        student2.addGrade(92);
        student2.addGrade(91);
        student2.addGrade(93);
        System.out.println("Student 2 average: " + student2.getGradeAverage());
    }
}
