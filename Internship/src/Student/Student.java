package Student;
import java.util.Scanner;

class Student {
    private String name;
    private int[] scores;
    private char grade;

    public Student(String name, int numScores) {
        this.name = name;
        this.scores = new int[numScores];
        this.grade = ' ';
    }

    public void inputScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter scores for " + name + ":");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            try {
                scores[i] = scanner.nextInt();
                if (scores[i] < 0 || scores[i] > 100) {
                    System.out.println("Invalid score. Score must be between 0 and 100.");
                    i--; 
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    public void calculateGrade() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("Grade: " + grade);
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
