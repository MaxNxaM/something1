abstract class Song {
    protected String title;
    protected String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    abstract String getMusicalNotation();

    void displaySongInfo() {
        System.out.println("Виконавець: " + artist);
        System.out.println("Назва пісні: " + title);
    }
}
