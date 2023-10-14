package homework1.medicalCenter.person;

public class Patient extends Person {
    private String doctor;
    private String registrDetaTime;


    public Patient(String id, String name, String surname, String phone, String email, String doctor, String registrDetaTime) {
        super(id, name, surname, phone, email);
        this.doctor = doctor;
        this.registrDetaTime = registrDetaTime;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegistrDetaTime() {
        return registrDetaTime;
    }

    public void setRegistrDetaTime(String registrDetaTime) {
        this.registrDetaTime = registrDetaTime;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "doctor='" + doctor + '\'' +
                ", registrDetaTime='" + registrDetaTime + '\'' +
                '}';
    }
}
