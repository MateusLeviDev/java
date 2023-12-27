package E_OOPAssociation.domain;

public class Professor {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminar[] seminar) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminar;
    }

    public void print() {
        System.out.println("----------- START -----");
        System.out.println("Professor: " + this.name);
        if (this.seminars == null) return;
        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getAddress().getAddress());
            if (seminar.getStudent() == null || seminar.getStudent().length == 0) continue;
            System.out.println("---------STUDENTS------");
            for (Student student : seminar.getStudent()) {
                System.out.println("Student: " + student.getName() + ", age: " + student.getAge());
            }
            System.out.println();
            System.out.println("END-------------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminar() {
        return seminars;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminars = seminar;
    }
}
