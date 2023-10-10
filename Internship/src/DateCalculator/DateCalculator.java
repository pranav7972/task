package DateCalculator;
import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first date
        System.out.println("Enter the first date (day, month, year):");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        // Input for the second date
        System.out.println("Enter the second date (day, month, year):");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        // Validate input dates
        if (!isValidDate(day1, month1, year1) || !isValidDate(day2, month2, year2)) {
            System.out.println("Invalid input dates.");
            scanner.close();
            return;
        }

        // Calculate the number of days between the two dates
        int daysBetween = calculateDaysBetween(day1, month1, year1, day2, month2, year2);

        // Display the result
        System.out.println("Number of days between the two dates: " + daysBetween);

        scanner.close();
    }

    // Function to validate a date
    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day <= daysInMonth[month];
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to calculate the number of days between two dates
    private static int calculateDaysBetween(int day1, int month1, int year1, int day2, int month2, int year2) {
        int days = 0;

        while (year1 != year2 || month1 != month2 || day1 != day2) {
            days++;
            day1++;
            if (day1 > daysInMonth(month1, year1)) {
                day1 = 1;
                month1++;
                if (month1 > 12) {
                    month1 = 1;
                    year1++;
                }
            }
        }

        return days;
    }

    // Function to get the number of days in a month of a year
    private static int daysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        return daysInMonth[month];
    }
}

