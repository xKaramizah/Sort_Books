import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private int id;
    private String name;
    private String author;
    private int page;

    public Book(int id, String name, String author, int page) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.page = page;
    }

    @Override
    public int compareTo(Book b) {
        return this.getName().compareTo(b.getName());
        //return Integer.compare(getId(),b.getId());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }


}
