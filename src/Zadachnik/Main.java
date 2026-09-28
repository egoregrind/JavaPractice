package Zadachnik;

public class Main {
    public static void main() {
//        // ====== 1.1.x ======
//        // 1.1.1.
//        System.out.println("1.1.1. cущность Точка в двух плоскостях");
//
//        Point point1 = new Point(0, 0);
//        Point point2 = new Point(3, 2);
//        Point point3 = new Point(0, 1);
//
//        System.out.println(point1);
//        System.out.println(point2);
//        System.out.println(point3);
//
//        System.out.println();
//
//        // 1.1.2.
//        System.out.println("1.1.2. cущность Человек");
//
//        Human human1 = new Human("Клеопатра", 152);
//        Human human2 = new Human("Пушкин", 167);
//        Human human3 = new Human("Александр", 189);
//
//        System.out.println(human1);
//        System.out.println(human2);
//        System.out.println(human3);
//
//        System.out.println();
//
//        // 1.1.3.
//        System.out.println("1.1.3. cущность Имя");
//
//        Name name1 = new Name("", "Клеопатра", "");
//        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
//        Name name3 = new Name("Маяковский", "Владимир", "");
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//
//        System.out.println();
//
//        // 1.1.4.
//        System.out.println("1.1.4. cущность Время");
//
//        Time time1 = new Time(10);
//        Time time2 = new Time(10000);
//        Time time3 = new Time(100000);
//
//        System.out.println(time1);
//        System.out.println(time2);
//        System.out.println(time3);
//
//        System.out.println();
//
//        // 1.1.5.
//        System.out.println("1.1.5. cущность Дом");
//
//        House house1 = new House(1);
//        House house2 = new House(5);
//        House house3 = new House(23);
//
//        System.out.println(house1);
//        System.out.println(house2);
//        System.out.println(house3);
//
//        System.out.println();

        // ====== 1.2.x ======
        // 1.2.1.
        System.out.println("1.2.1. cущность Линия.");

        Line line1 = new Line(1, 3, 23, 8);
        Line line2 = new Line(5, 10, 25, 10);
        Line line3 = new Line(line1.getBegin(), line2.getEnd());

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();
        line1.setBegin(0, 0);
        line2.setEnd(15, 15);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();
        line1.setEnd(0, 30);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

        // 1.2.2.
        System.out.println("1.2.2. Человек в комбинации с Именем.");

        Human human1 = new Human(
                new Name(
                    "",
                    "Клеопатра",
                    ""),
                152);
        Human human2 = new Human(
                new Name(
                        "Пушкин",
                        "Александр",
                        "Сергеевич"),
                167);
        Human human3 = new Human(
                new Name(
                    "Маяковский",
                    "Владимир",
                    ""),
                189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println();

        // 1.2.3.
        Human human4 = new Human(new Name("Чудов", "Иван", ""));
        Human human5 = new Human(new Name("Чудов", "Петр", ""));
        Human human6 = new Human(new Name("", "Борис", ""));

        human5.setFather(human4);
        human6.setFather(human5);

        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);

        System.out.println();

        // 1.2.4.

    }
    
}
