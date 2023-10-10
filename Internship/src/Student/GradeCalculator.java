package Student;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of scores: ");
        int numScores = scanner.nextInt();

        Student student = new Student(name, numScores);

        student.inputScores();

        student.calculateGrade();

        student.displayInfo();

        scanner.close();
    }
}





