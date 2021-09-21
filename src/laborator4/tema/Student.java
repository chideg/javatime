package laborator4.tema;

import java.util.*;

public class Student {
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

    public int averageGrade() {
        int suma = 0;
        for (Integer nota : materiiStudent.values()) {
            suma += nota;
        }
        Integer medie = suma / materiiStudent.size();
        return medie;
    }

    String getGradeForSubject(String materie) {
        return "Studentul " + nume + " " + prenume + " pentru materia " + materie + " are nota: " + materiiStudent.get(materie);
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

}
