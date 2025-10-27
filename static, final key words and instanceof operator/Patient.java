public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final int patientID;  // final unique identifier
    private String name;
    private int age;
    private String ailment;

    // Constructor uses 'this' to resolve ambiguity
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of Patient.");
        }
    }

    // Test main method
    public static void main(String[] args) {
        Patient p1 = new Patient(1001, "John Smith", 45, "Flu");
        Patient p2 = new Patient(1002, "Mary Johnson", 32, "Fracture");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();

        Object obj = new Object();
        if (obj instanceof Patient) {
            ((Patient) obj).displayPatientDetails();
        } else {
            System.out.println("obj is not an instance of Patient.");
        }
    }
}
