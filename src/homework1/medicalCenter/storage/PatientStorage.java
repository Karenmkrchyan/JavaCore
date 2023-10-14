package homework1.medicalCenter.storage;

import homework1.medicalCenter.person.Patient;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);

        }
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }


    public Patient getByID(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return patients[i];
            }
        }
        return null;

    }
}

