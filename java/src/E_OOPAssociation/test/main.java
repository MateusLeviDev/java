package E_OOPAssociation.test;

import E_OOPAssociation.domain.Address;
import E_OOPAssociation.domain.Professor;
import E_OOPAssociation.domain.Seminar;
import E_OOPAssociation.domain.Student;

public class main {
    public static void main(String[] args) {
        Address address = new Address("Rua das Laranjeiras");
        Student student = new Student("Luffy", 17);
        Student[] seminarStudents = new Student[]{student};
        Professor professor = new Professor("Barba Branca", "Pirata");
        Seminar seminar = new Seminar("Onde achar onde piece", seminarStudents, address);
        Seminar[] seminarsAvailable = {seminar};
        professor.setSeminar(seminarsAvailable);

        professor.print();

    }
}
