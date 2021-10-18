package laborator5.fourth;

public class ThrillerAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if (song.getComposer() == "Michael Jackson" && !checkIfPrime(song.getId()))
        songList.add(song);
    }
}
