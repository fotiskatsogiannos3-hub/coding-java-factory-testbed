package gr.aueb.cf.cf9.ch16;

public class Document implements Printable {
    private String title;

    public Document() {

    }

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document={title='" + title + "'}";
    }
}
