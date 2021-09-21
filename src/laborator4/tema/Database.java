package laborator4.tema;

import java.util.*;

public class Database {
    List<Student> studentsList = new ArrayList<>();
    List<Teacher> teachersList = new ArrayList<>();

    List<Student> findAllStudents() {
        HashMap<String, Integer> materiiCostin = new HashMap<String, Integer>();
        materiiCostin.put("Matematica", 5);
        materiiCostin.put("Fizica", 5);
        materiiCostin.put("Chimie", 5);

        Student student1 = new Student("Hideg", "Costin", materiiCostin);

        HashMap<String, Integer> materiiGigel = new HashMap<String, Integer>();
        materiiGigel.put("Matematica", 8);
        materiiGigel.put("Romana", 10);
        materiiGigel.put("Chimie", 9);

        Student student2 = new Student("Gigel", "Georgel", materiiGigel);

        studentsList.add(student1);
        studentsList.add(student2);
        return studentsList;
    }

    List<Teacher> findAllTeachers() {
        ArrayList<String> materiiVlase = new ArrayList<>();
        materiiVlase.add("Matematica");
        materiiVlase.add("Fizica");
        materiiVlase.add("Stiinta Materialelor");

        Teacher teacher1 = new Teacher("Adrian", "Vlase", materiiVlase);

        ArrayList<String> materiiAdina = new ArrayList<>();
        materiiAdina.add("Romana");
        materiiAdina.add("Engleza");
        materiiAdina.add("Chimie");
        materiiAdina.add("Matematica");


        Teacher teacher2 = new Teacher("Marina", "Adina", materiiAdina);
        teachersList.add(teacher1);
        teachersList.add(teacher2);

        return teachersList;
    }

    ArrayList<Student> getStudentsBySubject(String materie) {
        ArrayList<Student> studentsMaterie = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getMateriiStudent().containsKey(materie)) {
                studentsMaterie.add(student);
            }
        }
        return studentsMaterie;
    }

    ArrayList<Teacher> findTeachersBySubject(String materie) {
        ArrayList<Teacher> teachersMaterie = new ArrayList<>();
        for (Teacher teacher: teachersList) {
            if (teacher.getListaMaterii().contains(materie)) {
                teachersMaterie.add(teacher);
            }
        }
        return teachersMaterie;
    }

//    Display studentsList sorted by average grade
    LinkedList<Student> getStudentsByAverageGrade(List <Student> allStudents) {
        TreeMap<Float, Student> map = new TreeMap<>();
        for (Student student: allStudents) {
            map.put(student.averageGrade(), student);
        }
        LinkedList<Student> sortedByAverageGrade = new LinkedList<>();
        map.forEach((k,v) -> {
//            System.out.println(k);
            sortedByAverageGrade.add(v);
        });

        return sortedByAverageGrade;
    }

    public static void main(String[] args) {
        Database database = new Database();
//        System.out.println(database.findAllStudents());
//        System.out.println(database.findAllTeachers());
//        System.out.println(database.getStudentsBySubject("Fizica"));
//        System.out.println(database.findTeachersBySubject("Chimie"));
        System.out.println(database.getStudentsByAverageGrade(database.findAllStudents()));
    }


}
