package laborator4.tema;

import java.util.*;

public class TaskFinal {
    public static void main(String[] args) {
        HashMap<String, Integer> materiiCostin = new HashMap<String, Integer>();
        materiiCostin.put("Matematica", 7);
        materiiCostin.put("Fizica", 7);
        materiiCostin.put("Chimie", 7);

        List<Student> listaStudenti = Collections.unmodifiableList(List.of(new Student("Costin", "Hideg", materiiCostin)));
//        listaStudenti.add(new Student("Ionut", "Florin", materiiCostin));
        System.out.println(listaStudenti.iterator()
                .next()
                .getMateriiStudent()
                .size());
        listaStudenti.iterator()
                .next()
                .getMateriiStudent()
                .clear();
        System.out.println(listaStudenti.iterator().next().getMateriiStudent().size());
    }
}
