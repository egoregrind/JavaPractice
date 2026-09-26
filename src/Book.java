public class Book {
    String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;

        if (author == null) {
            this.author = new Author(null);
        } else {
            this.author = author;
        }

        author.books;
    }

    public Book(String title) {
        this(title, null);
    }

    @Override
    public String toString() {
        if (title == null) {
            return "Информация о книге отсутствует";
        }
        if (author == null) {
            author = new Author(null);
        }
        return "Книга \"" +
                title +
                "\" - " +
                author;
    }
}
