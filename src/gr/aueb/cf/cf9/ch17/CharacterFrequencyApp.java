package gr.aueb.cf.cf9.ch17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reads characters from a text file and prints their frequency
 * both by character (ascending) and by percentage (descending).
 */
public class CharacterFrequencyApp {
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/input.txt"))) {
            int ch;

            while ((ch = br.read()) != -1) {
                charList.add((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long total = charList.size();

        Map<Character, Long> freqMap = charList.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("By character (ascending):");
        freqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf(Locale.US, "'%c' : %d (%.2f%%)%n",
                        e.getKey(), e.getValue(), (e.getValue() * 100.0 / total)));

        System.out.println();

        System.out.println("By percentage (descending):");
        freqMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .forEach(e -> System.out.printf(Locale.US, "'%c' : %d (%.2f%%)%n",
                        e.getKey(), e.getValue(), (e.getValue() * 100.0 / total)));
    }
}