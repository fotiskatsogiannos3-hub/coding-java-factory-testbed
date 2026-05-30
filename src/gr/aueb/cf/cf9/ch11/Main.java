package gr.aueb.cf.cf9.ch11;

/**
 *   Demonstrates the creation and usage of a {@link User} Java Bean.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Stathis", "Gewrgiou");

        System.out.println("{" + user.getId() + "," + user.getFirstname() + "," + user.getLastname() + "," + "}");
    }
}
