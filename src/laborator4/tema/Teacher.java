package laborator4.tema;

import java.util.ArrayList;

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
}
