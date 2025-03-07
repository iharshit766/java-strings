import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        
        // Display the calendar
        displayCalendar(month, year);
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int startDay = getStartDay(month, year);
        
        // Display the header with the month and year
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print indentation for the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        
        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February has 29 days in a leap year
        }
        return days[month];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the start day of the month using the Gregorian calendar algorithm
    public static int getStartDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m) / 12) % 7;
        return d0;
    }
}

/*
Input:
Enter month (1-12): 7
Enter year: 2005

Output:
   July 2005
Sun Mon Tue Wed Thu Fri Sat
                        1   2 
  3   4   5   6   7   8   9 
 10  11  12  13  14  15  16 
 17  18  19  20  21  22  23 
 24  25  26  27  28  29  30 
 31
*/
