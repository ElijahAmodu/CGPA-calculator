import java.util.Scanner;

public class GPA_CGPA_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of semesters: ");
        int numSemesters = input.nextInt();

        double totalGPA = 0.0;

        for (int semester = 1; semester <= numSemesters; semester++) {
            System.out.println("\nSemester " + semester + ":");
            double semesterGPA = calculateSemesterGPA(input);
            System.out.printf("GPA for Semester %d: %.2f\n", semester, semesterGPA);
            totalGPA += semesterGPA;
        }

        double cgpa = totalGPA / numSemesters;
        System.out.printf("\nCGPA: %.2f\n", cgpa);

        if (cgpa >= 3.50) {
            System.out.println("Class of Graduate: First Class");
        } else if (cgpa >= 3.00) {
            System.out.println("Class of Graduate: Second Class Upper");
        } else if (cgpa >= 2.00) {
            System.out.println("Class of Graduate: Second Class Lower");
        } else {
            System.out.println("Class of Graduate: Third Class or Pass");
        }
    }

    public static double calculateSemesterGPA(Scanner input) {
        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (int courseNum = 1; courseNum <= 10; courseNum++) {
            System.out.printf("Enter grade for Course %d: ", courseNum);
            String grade = input.next();
            int credits = 3;

            if (grade.equalsIgnoreCase("A")) {
                totalGradePoints += 4.0 * credits;
            } else if (grade.equalsIgnoreCase("B")) {
                totalGradePoints += 3.0 * credits;
            } else if (grade.equalsIgnoreCase("C")) {
                totalGradePoints += 2.0 * credits;
            } else if (grade.equalsIgnoreCase("D")) {
                totalGradePoints += 1.0 * credits;
            } else if (grade.equalsIgnoreCase("F")) {
                totalGradePoints += 0.0 * credits;
            } else {
                System.out.println("Invalid grade entered.");
                courseNum--; // Decrement courseNum to repeat the current course
                continue;
            }

            totalCredits += credits;
        }

        return totalGradePoints / totalCredits;
    }
}
