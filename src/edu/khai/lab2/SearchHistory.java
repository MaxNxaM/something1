package edu.khai.lab2;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class SearchHistory {
    private Map<String, LocalDateTime> songsSearched;

    SearchHistory() {
        songsSearched = new HashMap<>();
    }

    void addSongToHistory(String songTitle) {
        LocalDateTime creationDate = LocalDateTime.now();
        songsSearched.put(songTitle, creationDate);
    }

    LocalDateTime getCreationDate(String songTitle) {
        return songsSearched.get(songTitle);
    }

    boolean containsSong(String songTitle) {
        return songsSearched.containsKey(songTitle);
    }

    void removeSongFromHistory(String songTitle) {
        songsSearched.remove(songTitle);
    }

    void clearHistory() {
        songsSearched.clear();
    }

    void displayHistory() {
        System.out.println("Search History:");
        for (Map.Entry<String, LocalDateTime> entry : songsSearched.entrySet()) {
            System.out.println("Song: " + entry.getKey() + ", Creation Date: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        SearchHistory history = new SearchHistory();

        // Додавання пісень до історії
        history.addSongToHistory("Song1");
        history.addSongToHistory("Song2");
        history.addSongToHistory("Song3");

        // Виведення історії
        history.displayHistory();
    }

    void addSongToHistory(String songTitle, LocalDateTime creationDate) {
        songsSearched.put(songTitle, creationDate);
    }
}
