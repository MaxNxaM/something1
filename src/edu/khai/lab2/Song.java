package edu.khai.lab2;

import java.time.LocalDateTime;
import java.util.Objects;

abstract class Song {
    protected String title; // Назва
    protected String artist; // Виконавець
    protected LocalDateTime creationDate; // Додано поле creationDate

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.creationDate = LocalDateTime.now(); // Ініціалізація creationDate в конструкторі
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return title.equals(song.title) &&
                artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Пісня {" + // Замість "Song {"
                " назва='" + title + '\'' +
                ", виконавець='" + artist + '\'' +
                ", дата створення=" + creationDate +
                '}';
    }

    abstract String getMusicalNotation();

    void displaySongInfo() {
        System.out.println("Виконавець: " + artist);
        System.out.println("Назва пісні: " + title);
        System.out.println("Дата створення: " + creationDate);
    }
}
