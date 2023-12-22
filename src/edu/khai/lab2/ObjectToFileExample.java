package edu.khai.lab2;

import java.io.*;

public class ObjectToFileExample {
    public static void main(String[] args) {
        try {
            // Create instances of your classes
            Song song1 = new NotesSong("Пісня1", "Виконавець1", "Ноти1", "Текст пісні 1");
            Song song2 = new GuitarTabsSong("Пісня2", "Виконавець2", "Табулатура2");

            // Output objects to a text file
            saveObjectsToFile("objects.txt", song1, song2);

            // Read objects from the file and display them
            readAndDisplayObjectsFromFile("objects.txt");
        } catch (InvalidSongException e) {
            e.printStackTrace();
        }
    }

    private static void saveObjectsToFile(String filename, Song... songs) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            for (Song song : songs) {
                writer.println(song.toString());
            }
            System.out.println("Objects saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndDisplayObjectsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Objects read from file: " + filename);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
