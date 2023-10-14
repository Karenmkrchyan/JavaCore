package homework1.medicalCenter;

import homework1.medicalCenter.person.Doctor;
import homework1.medicalCenter.person.Patient;
import homework1.medicalCenter.storage.DoctorStorage;
import homework1.medicalCenter.storage.PatientStorage;

import java.util.Locale;
import java.util.Scanner;

public class MedicalCenterMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DoctorStorage doctorStorage = new DoctorStorage();
    private static final PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    adDoctor();
                    break;
                case "5":
                    addPatient();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorBiId();
                    break;
                case "6":
                    doctorStorage.print();
                    patientStorage.print();
                    break;
                case "7":
                    patientStorage.print();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");


            }
        }

    }


    private static void changeDoctorBiId() {

        System.out.println("Pleas input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "already exist!!!");
            return;
        }
        System.out.println("please input new doctor id");
        String doctorID = scanner.nextLine();
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        System.out.println("please input profession");
        String profession = surname.toLowerCase(Locale.ROOT);
        doctorFromStorage.setId(doctorID);
        doctorFromStorage.setName(name);
        doctorFromStorage.setSurname(surname);
        doctorFromStorage.setProfession(profession);

    }

    private static void deleteDoctorById() {
        System.out.println("Pleas input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "already exist!!!");
            return;
        }
        doctorStorage.deleteBYId(doctorId);

    }

    private static void searchDoctorByProfession() {

        System.out.println("Pleas input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "already exist!!!");
        }

    }


    private static void addPatient() {
        System.out.println("Pleas input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Doctor with " + doctorId + "already exist!!!");
            return;
        }
        System.out.println("Please input patient id");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getByID(patientId);
        if (patientFromStorage != null) {
            System.out.println("company with " + patientId + " does not exists!!!");
            return;
        }
        System.out.println("Please input name");
        String patientName = scanner.nextLine();
        System.out.println("Please input surname");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input phone number");
        String pattientPhon = scanner.nextLine();
        System.out.println("please input email");
        String patientEmail = scanner.nextLine();
        System.out.println("please input register date time");
        String time = scanner.nextLine();
        Patient patient = new Patient(doctorId, patientId, patientName, patientSurname, pattientPhon, patientEmail, time);
    }


    private static void adDoctor() {
        System.out.println("Pleas input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Doctor with " + doctorId + "already exist!!!");
            return;
        }
        System.out.println("Please input name");
        String Name = scanner.nextLine();
        System.out.println(" Please input Surname");
        String Surname = scanner.nextLine();
        System.out.println("Please input phone number");
        String PhoneNum = scanner.nextLine();
        System.out.println("please input email");
        String Email = scanner.nextLine();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();

        Doctor doctor = new Doctor(doctorId, Name, Surname, PhoneNum, Email, profession);
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD DOCTOR");
        System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 for DELITE DOCTOR BY ID");
        System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 for ADD PATIENT ");
        System.out.println("Please input 6 for PRINT ALL PATIENT BY DOCTOR  ");
        System.out.println("Please input 7 for PRINT ALL PATIENT  ");
    }
}
