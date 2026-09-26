public class Main {
    public static void main(String[] args) {
        Author a = new Author("Тургенев");
        Book b = new Book("Муму", a);
        Book b2 = new Book("Отцы и Дети", a);

        System.out.println(b);
        System.out.println(b2);

        a.name = "Иван Тургенев";

        System.out.println(b);
        System.out.println(b2);

        a.printBooks();
    }
}
// дз: до 1.5 вкл. + сделать список книг