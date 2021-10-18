package laborator5.fourth;

public class DangerousAlbum extends Album{

    @Override
    public void addSong(Song song) {
        if (checkIfPrime(song.getId())) {
            songList.add(song);
        }
    }
}
