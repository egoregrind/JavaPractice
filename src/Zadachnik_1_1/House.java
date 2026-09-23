package Zadachnik_1_1;

public class House {
    private int floorCount;

    public House(int floorCount) {
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        String res = "дом с " + floorCount;

        if (floorCount % 10 == 1) {
            res += " этажом";
        } else {
            res += " этажами";
        }

        return res;
    }
}
