package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Steve");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);
        students.put("steve-rogers", student1);

        Student student2 = new Student("Tony");
        student2.addGrade(95);
        student2.addGrade(92);
        student2.addGrade(91);
        student2.addGrade(93);
        students.put("tony-stark", student2);

        Student student3 = new Student("Thor");
        student3.addGrade(70);
        student3.addGrade(75);
        student3.addGrade(80);
        students.put("thor-odinson", student3);

        Student student4 = new Student("Peter");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);
        students.put("peter-parker", student4);

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("GitHub username\tAverage grade");
            for (String githubUsername : students.keySet()) {
                System.out.println(githubUsername + "\t\t" + students.get(githubUsername).getGradeAverage());
            }
            System.out.print("\nWhich student would you like to see more information about? (Enter a GitHub username): ");
            String input = scanner.nextLine();
            if (!students.containsKey(input)) {
                System.out.println("No student found with the GitHub username: " + input);
            } else {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName());
                System.out.println("Grades: " + student.grades);
            }
            System.out.print("\nWould you like to see another student's information? (y/n): ");
            choice = scanner.nextLine();
        }
        System.out.println("Goodbye!");
    }
}
