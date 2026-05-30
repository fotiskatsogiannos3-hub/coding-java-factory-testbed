package gr.aueb.cf.cf9.ch11;

/**
 * A simple Java Bean that represents a user.
 * Holds basic user information such as id, first name and last name.
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    public User(){

    }

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
