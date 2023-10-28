package E_OOPAssociation.domain;

public class Seminar {
    private String title;
    private Student[] student;
    private Address address;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] student, Address address) {
        this.title = title;
        this.student = student;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
