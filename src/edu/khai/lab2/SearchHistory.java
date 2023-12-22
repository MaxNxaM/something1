package edu.khai.lab2;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class SearchHistory {
    // Додано приватне поле з колекцією (Map)
    private Map<String, LocalDateTime> songsSearched;

    SearchHistory() {
        // Ініціалізація колекції в конструкторі (використовуючи HashMap)
        songsSearched = new HashMap<>();
    }

    // Метод додавання пісні до колекції
    void addSongToHistory(String songTitle) {
        // Додавання назви пісні та дати створення до Map
        songsSearched.put(songTitle, LocalDateTime.now());
    }

    // Метод отримання дати створення пісні з колекції
    LocalDateTime getCreationDate(String songTitle) {
        return songsSearched.get(songTitle);
    }

    // Метод перевірки наявності пісні у колекції
    boolean containsSong(String songTitle) {
        return songsSearched.containsKey(songTitle);
    }

    // Метод видалення пісні з колекції
    void removeSongFromHistory(String songTitle) {
        songsSearched.remove(songTitle);
    }

    // Метод очищення історії
    void clearHistory() {
        songsSearched.clear();
    }

    // Метод виведення історії
    void displayHistory() {
        System.out.println("Search History:");
        for (Map.Entry<String, LocalDateTime> entry : songsSearched.entrySet()) {
            System.out.println("Song: " + entry.getKey() + ", Creation Date: " + entry.getValue());
        }
    }
}