package laborator5.fourth;

public class Song {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getComposer() {
        return composer;
    }

    private String composer;

    public Song(String name, int id, String composer) {
        this.name = name;
        this.id = id;
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", composer='" + composer + '\'' +
                '}';
    }
}
