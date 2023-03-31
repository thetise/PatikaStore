package bookSet;

import java.util.Comparator;

public class Book{

    private String name;
    private int page;
    private String author;
    private int releaseDate;

    Book(String name, int page, String author, int releaseDate){
        this.name = name;
        this.page = page;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
