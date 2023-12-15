package edu.khai.lab2;

import java.util.Objects;

abstract class Song {
    protected String title;
    protected String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
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
        return "Song {" +
                " назва= '" + title + '\'' +
                ", виконавець= '" + artist + '\'' +
                '}';
    }

    abstract String getMusicalNotation() throws InvalidSongException;

    void displaySongInfo() {
        System.out.println("Виконавець: " + artist);
        System.out.println("Назва пісні: " + title);
    }
}