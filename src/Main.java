public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Тургенев");
        Author a2 = new Author("Лев Толстой");

        Book b = new Book("Муму", a1, a2);
        Book b2 = new Book("Отцы и Дети", a1);

        a1.setName("Иван Тургенев");

        System.out.println(a1.printBooks());
        System.out.println(a2.printBooks());
    }
}