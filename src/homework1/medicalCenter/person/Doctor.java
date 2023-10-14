package homework1.medicalCenter.person;

public class Doctor extends Person {
    private String profession;

    public Doctor(String id, String name, String surname, String phone, String email, String profession) {
        super(id, name, surname, phone, email);
        this.profession = profession;
    }

    public Doctor(String id, String name, String surname, String phone, String email) {
        super(id, name, surname, phone, email);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "profession='" + profession + '\'' +
                '}';
    }
}
