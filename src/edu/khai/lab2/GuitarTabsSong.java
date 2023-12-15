package edu.khai.lab2;

class GuitarTabsSong extends Song {
    private String guitarTabs;

    GuitarTabsSong(String title, String artist, String guitarTabs) throws InvalidSongException {
        super(title, artist);

        if (guitarTabs == null) {
            throw new InvalidSongException("guitarTabs не може бути null");
        }

        this.guitarTabs = guitarTabs;
    }

    @Override
    String getMusicalNotation() throws InvalidSongException {
        if (guitarTabs == null || guitarTabs.isEmpty()) {
            throw new InvalidSongException("guitarTabs не може бути null або порожнім");
        }
        return guitarTabs;
    }
}
