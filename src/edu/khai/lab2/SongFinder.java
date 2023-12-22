package edu.khai.lab2;

import java.time.LocalDateTime;

public class SongFinder {
    public static void main(String[] args) {
        SearchHistory history = new SearchHistory();

        try {
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

            // Додавання пісень до історії з датою створення
            LocalDateTime creationDate1 = LocalDateTime.now();
            LocalDateTime creationDate2 = LocalDateTime.now().minusHours(1);

            history.addSongToHistory("Song1", creationDate1);
            history.addSongToHistory("Song2", creationDate2);

            // Виведення історії
            history.displayHistory();

            // Виведення дати і часу створення для об'єкту
            NotesSong notesSong = new NotesSong("NoteSong1", "Artist1", "Notes1", "Lyrics for NoteSong1");
            System.out.println("Creation date of NoteSong1: " + notesSong.creationDate);

        } catch (InvalidSongException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
