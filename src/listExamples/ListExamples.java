package listExamples;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.UnaryOperator;

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Person {

}

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(4);
        listNum.add(22);
        listNum.add(16);
        listNum.add(7);
        listNum.add(-8);
        listNum.add(10);

        ArrayList<String> listNull = new ArrayList<>();
        listNull.add(null);

        ArrayList<Student> listStudents = new ArrayList<>();
        Student mihai = new Student("Mihai", 26);
        listStudents.add(mihai);
        Student vali = new Student("Vali", 27);
        listStudents.add(vali);
        Student bob = new Student("Bob", 22);
        listStudents.add(bob);
        listStudents.add(null);

        ArrayList<Person> listNullObject = new ArrayList<>();
        listNullObject.add(new Person());

        //int size();
        System.out.println("---int size();---");
        System.out.println(listNum.size());
        System.out.println(listNull.size());
        System.out.println(listNullObject.size());
        System.out.println();


        //boolean isEmpty();
        System.out.println("---boolean isEmpty();---");
        System.out.println(listNum.isEmpty());
        System.out.println(new ArrayList().isEmpty());
        System.out.println(listNull.isEmpty());
        System.out.println(listStudents.isEmpty());
        System.out.println(listNullObject.isEmpty());
        System.out.println();

        //boolean contains(Object o);
        System.out.println("---boolean contains(Object o);---");
        System.out.println(listNum.contains(22));
        System.out.println(listNum.contains(0));
        System.out.println(listNull.contains(null));
        System.out.println(listStudents.contains(bob));
        System.out.println(listStudents.contains(null));
        System.out.println();

        //Iterator<E> iterator();
        System.out.println("---Iterator<E> iterator();---");
        System.out.println(listNum);
        Iterator<Integer> iteratorNum = listNum.iterator();
        while (iteratorNum.hasNext()) {
            System.out.println(iteratorNum.next());
        }

        System.out.println(listStudents);
        Iterator<Student> iteratorStudent = listStudents.iterator();
        while (iteratorStudent.hasNext()) {
            System.out.println(iteratorStudent.next());
        }
        System.out.println();

        //Object[] toArray();
        System.out.println("---Object[] toArray();---");
        Object[] studentsList = listStudents.toArray();
        for (Object student: studentsList) {
            System.out.println(student);
        }

        Object[] numList = listNum.toArray();
        System.out.println(numList[1]);
        System.out.println();

        //<T> T[] toArray(T[] a);
        System.out.println("---<T> T[] toArray(T[] a);---");
        Integer[] y = listNum.toArray(new Integer[0]);
        System.out.println(y[5]);
        System.out.println();

        //boolean add(E e);
        System.out.println("---boolean add(E e);---");
        System.out.println(listNum);
        listNum.add(7);
        listNum.add(3, 99);
        System.out.println(listNum);

        System.out.println(listStudents);
        listStudents.add(new Student("Mircea", 24));
        System.out.println(listStudents);
        System.out.println();

        //boolean remove(Object o);
        System.out.println("---boolean remove(Object o);---");
        System.out.println(listNum);
        listNum.remove(2);
        listNum.remove(2);
        System.out.println(listNum);
        System.out.println(listStudents);
        listStudents.remove(mihai);
        listStudents.remove(2);
        System.out.println(listStudents);

        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getName() == "Mircea") {
                listStudents.remove(i);
            }
        }
        System.out.println(listStudents);
        System.out.println();

        //boolean containsAll(Collection<?> c);
        System.out.println("---boolean containsAll(Collection<?> c);---");
        System.out.println(listNum);
        ArrayList<Integer> listNum1 = new ArrayList<>();
        listNum1.add(65);
        listNum1.add(34);
        listNum1.add(91);
        listNum1.add(27);
        System.out.println(listNum1);
        ArrayList<Integer> listNum2 = listNum;
        ArrayList<Integer> listNum3 = new ArrayList<>();
        listNum3.add(4);
        listNum3.add(7);

        System.out.println(listNum.containsAll(listNum1));
        System.out.println(listNum.containsAll(listNum2));
        System.out.println(listNum.containsAll(listNum3));


        Collection<Student> collection = new ArrayList<>();

//        collection.add(mihai);
        collection.add(bob);
        collection.add(vali);
        System.out.println(listStudents);
        System.out.println(collection);
        System.out.println(listStudents.containsAll(collection));
        System.out.println();

        //boolean addAll(Collection<? extends E> c);
        System.out.println("---boolean addAll(Collection<? extends E> c);---");
        System.out.println(collection);
        Collection<Student> collection1 = new ArrayList<>(collection);
        System.out.println(collection1);
        ArrayList<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Costin", 22));
        studentList1.addAll((ArrayList)collection);
        System.out.println(studentList1);
        System.out.println();

        //boolean addAll(int index, Collection<? extends E> c);
        System.out.println("---boolean addAll(int index, Collection<? extends E> c);---");
        System.out.println(studentList1);
        ArrayList<Student> studentList2 = new ArrayList<>(studentList1);
        System.out.println(studentList2);
        System.out.println(collection1);
        studentList2.addAll(1, collection1);
        System.out.println(studentList2);
        System.out.println();

        //boolean removeAll(Collection<?> c);
        System.out.println("---boolean removeAll(Collection<?> c);---");
        System.out.println(studentList2);
        System.out.println(collection1);
        studentList2.removeAll(collection1);
        System.out.println(studentList2);
        System.out.println();

        //boolean retainAll(Collection<?> c);
        System.out.println("---boolean retainAll(Collection<?> c);---");
        System.out.println(studentList1);
        Collection removeStudents = new ArrayList();
        removeStudents.add(bob);
        removeStudents.add(vali);
        studentList1.retainAll(removeStudents);
        System.out.println(studentList1);
        System.out.println();

        //default void replaceAll(UnaryOperator<E> operator)
        System.out.println("---default void replaceAll(UnaryOperator<E> operator)---");
        System.out.println(studentList1);
        UnaryOperator<Student> replaceOperator = student -> new Student("OperatorTest", 100);
        studentList1.replaceAll(replaceOperator);
        System.out.println(studentList1);
        System.out.println();

        //default void sort(Comparator<? super E> c)
        System.out.println("---default void sort(Comparator<? super E> c)---");
        studentList2.add(vali);
        studentList2.add(bob);
        bob.setAge(25);
        System.out.println(studentList2);
        Comparator byAge = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int age1 = ((Student)o1).getAge();
                int age2 = ((Student)o2).getAge();

                if (age1 > age2) {
                    return 1;
                }
                else if (age1 == age2) {
                    return 0;
                }
                return -1;
            }
        };
        studentList2.sort(byAge);
        System.out.println(studentList2);
        System.out.println();

        //void clear();
        System.out.println("---void clear();---");
        System.out.println(studentList2);
        studentList2.clear();
        System.out.println(studentList2);
        System.out.println();

        //boolean equals(Object o);
        System.out.println("---boolean equals(Object o);---");
        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(bob);
        list3.add(vali);
        list3.add(mihai);
        list3.add(new Student("Sergiu", 28));
        System.out.println(list3);
        ArrayList<Student> list4 = list3;
        ArrayList<Student> list5 = new ArrayList<>();
        list5.add(new Student("Kevin", 5));
        System.out.println(list3.equals(list4));
        System.out.println(list5.equals(list4));
        System.out.println();

        //int hashCode();
        System.out.println("---int hashCode();---");
        System.out.println(list3.hashCode());
        System.out.println(list4.hashCode());
        System.out.println(list5.hashCode());
        System.out.println();

        // Positional Access Operations
        //get(int index);
        System.out.println("---get(int index);---");
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println();

        //set(int index, E element);
        System.out.println("---set(int index, E element);---");
        System.out.println(list3);
        list3.set(1, new Student("Victor", 20));
        System.out.println(list3);
        System.out.println();

        //void add(int index, E element);
        System.out.println("---void add(int index, E element);---");
        System.out.println(list3);
        list3.add(2, new Student("Doru", 21));
        System.out.println(list3);
        System.out.println();

        //remove(int index);
        System.out.println("---remove(int index);---");
        System.out.println(list3);
        list3.remove(3);
//        list3.remove(3);
        System.out.println(list3);
        System.out.println();

        // Search Operations
        //remove(int indexOf(Object o););
        System.out.println("---int indexOf(Object o);---");
        System.out.println(list3.indexOf(bob));
        System.out.println(list3.indexOf(mihai));
        System.out.println();

        //int lastIndexOf(Object o);
        System.out.println("---int lastIndexOf(Object o);---");
        list3.add(bob);
        System.out.println(list3);
        System.out.println(list3.lastIndexOf(bob));
        System.out.println();

        // List Iterators
        //ListIterator<E> listIterator();
        System.out.println("---ListIterator<E> listIterator();---");
        ListIterator<Student> listIterator1 = list3.listIterator();
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next().getName());
        }
        System.out.println();

        //ListIterator<E> listIterator(int index);
        System.out.println("---ListIterator<E> listIterator(int index);---");
        ListIterator<Student> listIterator2 = list3.listIterator(2);
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next().getName());
        }
        System.out.println();

        //List<E> subList(int fromIndex, int toIndex);
        System.out.println("---List<E> subList(int fromIndex, int toIndex);---");
        System.out.println(list4);
        System.out.println(list4.subList(1,4));
        System.out.println();






        }
}
