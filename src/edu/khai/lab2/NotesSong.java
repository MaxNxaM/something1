package edu.khai.lab2;

public class NotesSong extends Song implements LyricsProvider {
    private String notes;
    private String lyrics;

    NotesSong(String title, String artist, String notes, String lyrics) throws InvalidSongException {
        super(title, artist);

        if (notes == null || notes.isEmpty()) {
            throw new InvalidSongException("notes не може бути null або порожнім");
        }

        this.notes = notes;
        this.lyrics = lyrics;
    }

    @Override
    String getMusicalNotation() throws InvalidSongException {
        if (notes == null || notes.isEmpty()) {
            throw new InvalidSongException("notes не може бути null або порожнім");
        }
        return notes;
    }

    @Override
    public String getLyrics() {
        return lyrics;
    }

    @Override
    void displaySongInfo() {
        super.displaySongInfo();
        System.out.println("Ноти: " + notes);
        System.out.println("Текст пісні: " + lyrics);
    }
}