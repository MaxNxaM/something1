package edu.khai.lab2;

public class SongFinder {
    public static void main(String[] args) {
        SearchHistory history = new SearchHistory();

        Song mySong = new NotesSong("Пісня1", "Виконавець1", "Ноти1", "Текст пісні 1");
        Song anotherSong = new GuitarTabsSong("Пісня2", "Виконавець2", "Табулатура2");

        boolean areSongsEqual = mySong.equals(anotherSong);
        System.out.println("Чи однакові пісні " + mySong + " та " + anotherSong + "? " + areSongsEqual);

        history.addSongToHistory(mySong.toString());
        System.out.println(mySong);

        System.out.println("--------------------");

        history.addSongToHistory(anotherSong.toString());
        System.out.println(anotherSong);

        System.out.println("--------------------");

        history.displayHistory();
    }
}
