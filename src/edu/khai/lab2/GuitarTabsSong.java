package edu.khai.lab2;

class GuitarTabsSong extends Song {
    private String guitarTabs;

    GuitarTabsSong(String title, String artist, String guitarTabs) {
        super(title, artist);
        this.guitarTabs = guitarTabs;
    }

    @Override
    String getMusicalNotation() {
        return guitarTabs;
    }
}