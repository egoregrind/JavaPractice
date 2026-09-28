public class Main {
    public static void main(String[] args) {
        Author a = new Author("Тургенев");

        Book b = new Book("Муму", a);
        Book b2 = new Book("Отцы и Дети", a);

        a.setName("Иван Тургенев");

        System.out.println(a.printBooks());
    }
}