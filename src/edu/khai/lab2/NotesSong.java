package edu.khai.lab2;

class NotesSong extends Song implements LyricsProvider {
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

    // Видалено throws InvalidSongException з підпису методу
    @Override
    String getMusicalNotation() {
        // Залишити код методу без змін, або внести необхідні зміни
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
