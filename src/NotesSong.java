class NotesSong extends Song implements LyricsProvider {
    private String musicalNotes;
    private String lyrics;

    NotesSong(String title, String artist, String musicalNotes, String lyrics) {
        super(title, artist);
        this.musicalNotes = musicalNotes;
        this.lyrics = lyrics;
    }

    @Override
    String getMusicalNotation() {
        return musicalNotes;
    }

    @Override
    public String getLyrics() {
        return lyrics;
    }
}