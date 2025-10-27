import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors; // patients can have multiple doctors

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " is consulting with:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients; // doctors can see multiple patients

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);  // maintain bidirectional association
        }
    }

    // Communication method: consultation
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting Patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " does not have Patient " + patient.getName() + " registered.");
        }
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " is seeing patients:");
        for (Patient p : patients) {
            System.out.println("  " + p.getName());
        }
    }
}

// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showHospital() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("  " + p.getName());
        }
    }
}

// Demonstration
public class Platform {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor docSmith = new Doctor("Smith");
        Doctor docJones = new Doctor("Jones");

        Patient patAlice = new Patient("Alice");
        Patient patBob = new Patient("Bob");

        hospital.addDoctor(docSmith);
        hospital.addDoctor(docJones);

        hospital.addPatient(patAlice);
        hospital.addPatient(patBob);

        // Establish associations (many-to-many)
        docSmith.addPatient(patAlice);
        docSmith.addPatient(patBob);
        docJones.addPatient(patAlice);

        // Communication through consult method
        docSmith.consult(patAlice);
        docJones.consult(patBob);  // not associated, shows message

        // Show all doctors and their patients
        docSmith.showPatients();
        docJones.showPatients();

        // Show all patients and their doctors
        patAlice.showDoctors();
        patBob.showDoctors();

        // Show hospital info
        hospital.showHospital();
    }
}
