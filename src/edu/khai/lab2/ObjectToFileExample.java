package edu.khai.lab2;

import java.io.*;

public class ObjectToFileExample {
    public static void main(String[] args) {
        try {
            // Create instances of your classes
            Song song1 = new NotesSong("Пісня1", "Виконавець1", "Ноти1", "Текст пісні 1");
            Song song2 = new GuitarTabsSong("Пісня2", "Виконавець2", "Табулатура2");

            // Output objects to a file
            saveObjectsToFile("objects.dat", song1, song2);

            // Read objects from the file and display them
            readAndDisplayObjectsFromFile("objects.dat");
        } catch (InvalidSongException e) {
            e.printStackTrace();
        }
    }

    private static void saveObjectsToFile(String filename, Song... songs) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            for (Song song : songs) {
                oos.writeObject(song);
            }
            System.out.println("Objects saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndDisplayObjectsFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("Objects read from file: " + filename);
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Song) {
                        Song song = (Song) obj;
                        System.out.println(song);
                    }
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
