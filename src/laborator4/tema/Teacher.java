package laborator4.tema;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher {
    private String nume;
    private String prenume;
    private ArrayList listaMaterii;

    public Teacher(String nume, String prenume, ArrayList listaMaterii) {
        this.nume = nume;
        this.prenume = prenume;
        this.listaMaterii = listaMaterii;
    }

    public Teacher(Teacher teacher) {
        this.nume = nume;
        this.prenume = prenume;
        this. listaMaterii = listaMaterii;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", listaMaterii=" + listaMaterii +
                '}';
    }

    public ArrayList getListaMaterii() {
        return listaMaterii;
    }

    Database database = new Database();

    public ArrayList<Teacher> getAllTeachers() {
        return database.findAllTeachers();
    }

    public ArrayList<Teacher> getTeachersBySubject(String subject) {
        return database.findTeachersBySubject(subject);
    }

    public ArrayList<Student> getAllStudents() {
        return database.findAllStudents();
    }

    public ArrayList<Student> getStudentsBySubject(String subject) {
        return database.getStudentsBySubject(subject);
    }

    public LinkedList<Student> getStudentsByAverageGrade() {
        return database.getStudentsByAverageGrade(database.findAllStudents());
    }

    public LinkedList<Student> getStudentsByGradeForSubject(String subject) {
        return database.getStudentsByGradeForSubject(subject);
    }
}
