import java.util.Scanner;
public class NumberPatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Pattern generator ===");
        System.out.println("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Choose type of pattern:");
        System.out.println("1. Right triangle");
        System.out.println("2. Inverted right triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Inverted pyramid");
        System.out.println("5. Square");
        System.out.print("Choose from 1 to 5: ");
        int choice = scanner.nextInt();

        System.out.println("Result:");
        switch (choice) {
            case 1:
                generateRightTriangle(rows);
                break;
            case 2:
                generateInvertedRightTriangle(rows);
                break;
            case 3:
                generatePyramid(rows);
                break;
            case 4:
                generateInvertedPyramid(rows);
                break;
            case 5:
                generateSquare(rows);
                break;
            default:
                System.out.println("Fail");
        }
        scanner.close();
    }

    public static void generateRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } System.out.println();
        }
    }
    public static void generateInvertedRightTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } System.out.println();
        }
    }
    public static void generatePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }System.out.println();
        }
    }

    public static void generateInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            } for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } System.out.println();
        }
    }

    public static void generateSquare(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
            }
        }

}

