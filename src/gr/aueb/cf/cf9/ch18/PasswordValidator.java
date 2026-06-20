package gr.aueb.cf.cf9.ch18;

/**
 * Validates passwords against a set of strength rules using a regular expression.
 */
public class PasswordValidator {
    public static void main(String[] args) {
        String[] testPasswords = {
                "Pass123!",
                "password",
                "PASS123!",
                "Pa1!",
                "Passw0rd!"
        };

        for (String pwd : testPasswords) {
            System.out.println(pwd + " -> " + isValidPassword(pwd));
        }
    }

    /**
     * Checks whether the given password is non-null and at least 8 characters long,
     * containing at least one lowercase letter, one uppercase letter, one digit
     * and one special character (#?!@$%^&*-).
     *
     * @param password the password to validate
     * @return true if the password satisfies all the strength rules, false otherwise
     */
    public static boolean isValidPassword(String password) {
        return (password != null)
                && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*\\-]).{8,}$");
    }
}
