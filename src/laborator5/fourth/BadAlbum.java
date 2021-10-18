package laborator5.fourth;

public class BadAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if (song.getName().length() == 3 && checkIfPalindrome(song.getId())) {
        songList.add(song);}
    }
}
