package laborator4.tema;

import java.util.*;

public class Database {
    private static int instanceCount = 0;

    public Database () {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    ArrayList<Student> studentsList = new ArrayList<>();
    ArrayList<Teacher> teachersList = new ArrayList<>();

    ArrayList<Student> findAllStudents() {
        HashMap<String, Integer> materiiCostin = new HashMap<String, Integer>();
        materiiCostin.put("Matematica", 7);
        materiiCostin.put("Fizica", 7);
        materiiCostin.put("Chimie", 7);

        Student student1 = new Student("Hideg", "Costin", materiiCostin);

        HashMap<String, Integer> materiiGigel = new HashMap<String, Integer>();
        materiiGigel.put("Matematica", 8);
        materiiGigel.put("Romana", 10);
        materiiGigel.put("Chimie", 9);

        Student student2 = new Student("Gigel", "Georgel", materiiGigel);


        HashMap<String, Integer> materiiIonel = new HashMap<String, Integer>();
        materiiIonel.put("Matematica", 6);
        materiiIonel.put("Romana", 7);
        materiiIonel.put("Chimie", 7);

        Student student3 = new Student("Ionel", "Ion", materiiIonel);

        HashMap<String, Integer> materiiMaria = new HashMap<String, Integer>();
        materiiMaria.put("Matematica", 3);
        materiiMaria.put("Romana", 1);
        materiiMaria.put("Chimie", 2);

        Student student4 = new Student("Maria", "Ioana", materiiMaria);

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        return studentsList;
    }

    ArrayList<Teacher> findAllTeachers() {
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
    LinkedList <Student> getStudentsByAverageGrade(List <Student> allStudents) {
        TreeMap<Float, List<Student>> map = new TreeMap<>();
        for (Student student: allStudents) {
            if (!map.containsKey(student.averageGrade())) {
                map.put(student.averageGrade(), new ArrayList<>());
            }
            List<Student> students = map.get(student.averageGrade());
            students.add(student);
        }
        LinkedList<Student> sortedByAverageGrade = new LinkedList<>();
//        System.out.println(map.keySet() + " " + map.values());
        for (float cheie : map.keySet()) {
            sortedByAverageGrade.addAll(map.get(cheie));
        }
//        System.out.println(sortedByAverageGrade);
        return sortedByAverageGrade;
    }

    LinkedList<Student> getStudentsByGradeForSubject (String subject) {
        TreeMap<Integer, ArrayList<Student>> mapStudentsBySubjectGrade = new TreeMap<>();
        for (Student student : getStudentsBySubject(subject)) {
            if (!mapStudentsBySubjectGrade.containsKey(student.getGradeForSubject(subject))) {
                mapStudentsBySubjectGrade.put(student.getGradeForSubject(subject), new ArrayList<>());
            }
            ArrayList<Student> newStudents = new ArrayList<>();
            newStudents.add(student);
            mapStudentsBySubjectGrade.get(student.getGradeForSubject(subject)).addAll(newStudents);
        }
        LinkedList<Student> sortedBygradeSubjectList = new LinkedList<>();
        for (Integer k: mapStudentsBySubjectGrade.keySet()) {
            sortedBygradeSubjectList.addAll(mapStudentsBySubjectGrade.get(k));
        }
        return sortedBygradeSubjectList;
    }

    public static void main(String[] args) {
        Database database = new Database();
//        System.out.println(database.findAllStudents());
//        System.out.println(database.findAllTeachers());
//        System.out.println(database.getStudentsBySubject("Fizica"));
//        System.out.println(database.findTeachersBySubject("Chimie"));
//        System.out.println(database.getStudentsByAverageGrade(database.findAllStudents()));
//        database.getStudentsByAverageGrade(database.findAllStudents());

        Comparator compareByAverage = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                float m1 = ((Student) o1).averageGrade();
                float m2 = ((Student) o2).averageGrade();

                if (m1 > m2) {
                    return 1;
                } else if (m1 == m2) {
                    return 0;
                }
                return -1;
            }
        };

        List<Student> allStudents = database.findAllStudents();
        String subject = "Matematica";
        System.out.println("List of students sorted by grade for subject : " + subject);
        System.out.println(database.getStudentsByGradeForSubject(subject));
        System.out.println("Number of Database instances: " + Database.getInstanceCount());
    }


}
