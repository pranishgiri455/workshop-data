public class SchoolApp {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Franklin", 15000, "Science", 14000);
        System.out.println("Teacher Annual Salary: " + t.calculateAnnualSalary());
        Staff s = new Staff(2, "Rocky", 0, 8, 5000);
        System.out.println("Staff Salary: " + s.calculateSalary());
        System.out.println("College Name: " + Person.collegeName);
    }
}