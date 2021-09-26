package laborator4.tema;

import javax.xml.crypto.Data;
import java.util.*;

public class Student{
    private String nume;
    private String prenume;
    private HashMap<String, Integer> materiiStudent;

    public Student(String nume, String prenume, HashMap<String, Integer> materiiStudent) {
        this.nume = nume;
        this.prenume = prenume;
        this.materiiStudent = materiiStudent;
    }

    public Student(Student student) {
        this.nume = student.nume;
        this.prenume = student.prenume;
        this.materiiStudent = student.materiiStudent;
    }

    public float averageGrade() {
        int suma = 0;
        for (Integer nota : materiiStudent.values()) {
            suma += nota;
        }
        float medie = (float) suma / materiiStudent.size();
        return medie;
    }

    int getGradeForSubject(String materie) {
        return materiiStudent.get(materie);
    }

    public HashMap<String, Integer> getMateriiStudent() {
        return materiiStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", materiiStudent=" + materiiStudent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) && Objects.equals(prenume, student.prenume) && Objects.equals(getMateriiStudent(), student.getMateriiStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, getMateriiStudent());
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
