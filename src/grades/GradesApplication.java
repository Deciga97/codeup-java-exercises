package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Steve");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);
        students.put("john-doe", student1);

        Student student2 = new Student("Anthony");
        student2.addGrade(95);
        student2.addGrade(92);
        student2.addGrade(91);
        student2.addGrade(93);
        students.put("jane-doe", student2);

        Student student3 = new Student("Taylor");
        student3.addGrade(70);
        student3.addGrade(75);
        student3.addGrade(80);
        students.put("bob-smith", student3);

        Student student4 = new Student("Cristy");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);
        students.put("alice-johnson", student4);

        System.out.println("GitHub username\tAverage grade");
        for (String githubUsername : students.keySet()) {
            System.out.println(githubUsername + "\t\t" + students.get(githubUsername).getGradeAverage());
        }
    }
}
