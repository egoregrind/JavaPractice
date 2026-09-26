public class Author {
    String name;
    Book[] books;

    public Author(String name) {
        if (name == null) {
            name = "Неизвестный автор";
        }
        this.name = name;
        this.books = new Book[1];
    }

    public String printBooks() {
        return books.toString();
    }

    @Override
    public String toString() {
        if (name == null) {
            name = "Неизвестный автор";
        }
        return name;
    }

}
