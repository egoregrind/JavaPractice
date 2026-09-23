package Zadachnik_1_1;

public class Main {
    public static void main() {
        System.out.println("1.1.1. cущность Точка в двух плоскостях");

        Dot dot1 = new Dot(0, 0);
        Dot dot2 = new Dot(3, 2);
        Dot dot3 = new Dot(0, 1);

        System.out.println(dot1);
        System.out.println(dot2);
        System.out.println(dot3);

        System.out.println();


        System.out.println("1.1.2. cущность Человек");

        Human human1 = new Human("Клеопатра", 152);
        Human human2 = new Human("Пушкин", 167);
        Human human3 = new Human("Александр", 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        
        System.out.println();


        System.out.println("1.1.3. cущность Имя");

        Name name1 = new Name("", "Клеопатра", "");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", "");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println();


        System.out.println("1.1.4. cущность Время");

        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println();


        System.out.println("1.1.5. cущность Дом");

        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

        System.out.println();
    }
    
}
