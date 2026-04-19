import java.util.Scanner;

public class ScholarshipChecker {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double gpa;

    System.out.print("Enter GPA (0.0 - 4.0): ");
    gpa = sc.nextDouble();

      if (gpa < 0 || gpa > 4) {
        System.out.println("Invalid GPA");
      }
      else if (gpa >= 3.6) {
        System.out.println("Eligible for Scholarship");
      }
      else {
        System.out.println("Not Eligible for Scholarship");
      }
  }
}