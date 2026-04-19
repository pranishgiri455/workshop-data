class Patient {
    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;
    Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    double calculateTotalBill() {
        double total = daysAdmitted * dailyCharge;
        if (daysAdmitted > 7) {
            total = total - (0.10 * total);
        }
        return total;
    }
    void displayDetails() {
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
}
public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ram", 25, 5, 10000);
        Patient p2 = new Patient("Sita", 30, 10, 15000);
        System.out.println("Patient 1 Details:");
        p1.displayDetails();
        System.out.println("Total Bill: " + p1.calculateTotalBill());
        System.out.println("----------------------");
        System.out.println("Patient 2 Details:");
        p2.displayDetails();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
}