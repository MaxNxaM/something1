package edu.khai.lab2;

class GuitarTabsSong extends Song {
    private String guitarTabs; // Табулатура

    // Конструктор для GuitarTabsSong змінено для використання поля creationDate
    GuitarTabsSong(String title, String artist, String guitarTabs) {
        super(title, artist);
        this.guitarTabs = guitarTabs;
    }

    // Видалено throws InvalidSongException з підпису методу
    @Override
    String getMusicalNotation() {
        // Залишити код методу без змін, або внести необхідні зміни
        return guitarTabs;
    }

    // Перевизначений метод displaySongInfo для виведення інформації про пісню
    @Override
    void displaySongInfo() {
        super.displaySongInfo();
        System.out.println("Табулатура: " + guitarTabs);
    }
}
