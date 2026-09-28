public class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.title = title;

        if (author == null) {
            this.author = new Author(Author.UNKNOWN_AUTHOR);
        } else {
            this.author = author;
        }

        author.addBook(this);
    }

    public Book(String title) {
        this(title, null);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        if (title == null || title.isBlank()) {
            return "Информация о книге отсутствует";
        }
        if (author == null) {
            author = new Author(Author.UNKNOWN_AUTHOR);
        }
        return "Книга \"" +
                title +
                "\" - " +
                author;
    }
}
