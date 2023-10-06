package edu.khai.lab2;

class SearchHistory {
    private String[] songsSearched;
    private int index;

    SearchHistory() {
        songsSearched = new String[10]; // Припустимо, максимальний розмір історії - 10 пісень
        index = 0;
    }

    void addSongToHistory(String songTitle) {
        if (index < songsSearched.length) {
            songsSearched[index] = songTitle;
            System.out.println("Пісня " + songTitle + " додана до історії пошуку.");
            index++;
        } else {
            System.out.println("Історія пошуку заповнена! Пісня " + songTitle + " не була додана.");
        }
    }

    void displayHistory() {
        System.out.println("Історія пошуку:");
        for (int i = 0; i < index; i++) {
            System.out.println(songsSearched[i]);
        }
    }
}
