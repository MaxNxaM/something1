package edu.khai.lab2;

public class SongFinder {
    public static void main(String[] args) {
        SearchHistory history = new SearchHistory();

        NotesSong mySong = new NotesSong("Пісня1", "Виконавець1", "Ноти1", "Текст пісні 1");
        GuitarTabsSong anotherSong = new GuitarTabsSong("Пісня2", "Виконавець2", "Табулатура2");
        boolean areSongsEqual = mySong.equals(anotherSong);
        System.out.println("Чи однакові пісні " + mySong + " та " + anotherSong + " " + areSongsEqual);
        // Пошук пісні:
        history.addSongToHistory(mySong.title);
        mySong.displaySongInfo();
        System.out.println("Ноти: " + mySong.getMusicalNotation());
        System.out.println("Текст: " + mySong.getLyrics());

        System.out.println("--------------------");

        history.addSongToHistory(anotherSong.title);
        anotherSong.displaySongInfo();
        System.out.println("Табулатура: " + anotherSong.getMusicalNotation());

        System.out.println("--------------------");

        // Вивід історії пошуку
        history.displayHistory();

        NotesSong anotherNotesSong = new NotesSong("Пісня1", "Виконавець1", "Ноти1", "Текст пісні 1");
        System.out.println("Чи однакові пісні? " + mySong);

    }
}
