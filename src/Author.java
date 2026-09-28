import java.util.ArrayList;
import java.util.List;

public class Author {
    static public final String UNKNOWN_AUTHOR = "Неизвестный автор";

    private String name;
    private List<Book> books;

    public Author(String name) {
        if (name == null || name.isBlank()) {
            name = UNKNOWN_AUTHOR;
        }
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            name = UNKNOWN_AUTHOR;
        }
        this.name = name;
    }

    public void addBook(Book b) {
        if (b == null) {
            throw new IllegalArgumentException();
        }

        this.books.addLast(b);
        System.out.println("[added] " + b);
    }

    public void addBook(List<Book> books) {
        if (books == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < books.toArray().length; i++) {
            this.books.addLast(books.get(i));
            System.out.println("[added] " + books.get(i));
        }
    }

    public String printBooks() {
        String res = name + ":\n";

        for (Book b : books) {
            res += "  - " + b.getTitle() + "\n";
        }
        return res;
    }

    @Override
    public String toString() {
        if (name == null || name.isBlank()) {
            name = UNKNOWN_AUTHOR;
        }
        return name;
    }

}
