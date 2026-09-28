package Zadachnik;

public class House {
    private int floorCount;

    public House(int floorCount) {
        if (floorCount < 1) {
            this.floorCount = 1;
            return;
        }
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
