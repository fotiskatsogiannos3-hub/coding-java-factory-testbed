package gr.aueb.cf.cf9.ch16;

public class Photo implements Printable {
    private String fileName;

    public Photo() {

    }

    public Photo(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Photo={fileName='" + fileName + "'}";
    }
}
