package gr.aueb.cf.cf9.ch16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();

        items.add(new Document("My Dog"));
        items.add(new Photo("sunset.jpg"));
        items.add("Hello I am a Cat!");

        for (Object obj : items) {
            if (obj instanceof Printable) {
                Printable p = (Printable) obj;
                Thread t = new Thread(p::print);
                t.start();
            }
        }
    }
}
