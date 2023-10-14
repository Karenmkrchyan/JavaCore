package homework1.medicalCenter.storage;

import homework1.medicalCenter.person.Doctor;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private int getIndexBYId(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }

        }
        return -1;
    }

    public void deleteBYId(String doctorId) {
        int indexById = getIndexBYId(doctorId);
        if (indexById == -1) {
            System.out.println(" doctor ddose not exsest");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];

        }
        size--;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);

        }
    }

    public Doctor getByID(String DoctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(DoctorId)) {
                return doctors[i];
            }

        }

        return null;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }


}
