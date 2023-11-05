/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declared Variables
        int gradeJava, gradeC, gradeDB, gradeAverage;

        // Input part
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your JAVA grade: ");
        gradeJava = scanner.nextInt();

        System.out.print("Input your C grade: ");
        gradeC = scanner.nextInt();

        System.out.print("Input your DATABASE grade: ");
        gradeDB = scanner.nextInt();

        // Process part (Arithmetic)
        gradeAverage = (gradeJava + gradeC + gradeDB) / 3;

        // Output part
        System.out.println("\nYour grade average is: " + gradeAverage);

        // Conditional Part (for output)
        if (gradeAverage >= 90 && gradeAverage <= 100) {
            System.out.println("Your grade is A");
        } else if (gradeAverage >= 80 && gradeAverage <= 89) {
            System.out.println("Your grade is B");
        } else if (gradeAverage >= 75 && gradeAverage <= 79) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }

        // Close the scanner
        scanner.close();
    }
}
