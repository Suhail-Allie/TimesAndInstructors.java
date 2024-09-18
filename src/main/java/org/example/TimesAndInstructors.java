package org.example;
import java.util.Scanner;

    public class TimesAndInstructors {
        public static void main(String[] args) {
            // Initialize a 2D array to store course name, time, and instructor
            String[][] courses = {
                    {"CIS101", "Mon 9 AM", "Khan"},
                    {"MATH101", "Tue 10 AM", "Smith"},
                    {"ENG201", "Wed 11 AM", "Johnson"},
                    {"HIST301", "Thu 2 PM", "Lee"},
                    {"CIS101", "Fri 1 PM", "Khan"}, // Same course, different time
            };

            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a course name
            System.out.print("Enter a course name (e.g., CIS101): ");
            String courseName = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency

            boolean courseFound = false;

            // Search the array for the course
            System.out.println("\nCourse details for " + courseName + ":");
            for (int i = 0; i < courses.length; i++) {
                if (courses[i][0].equalsIgnoreCase(courseName)) {
                    System.out.println("Time: " + courses[i][1] + ", Instructor: " + courses[i][2]);
                    courseFound = true;
                }
            }

            // If no matching course is found, display an error message
            if (!courseFound) {
                System.out.println("Error: Course not found.");
            }

            scanner.close();
        }
    }


