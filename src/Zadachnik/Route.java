package Zadachnik;

public class Route {
    private Town target;
    private int cost;

    public Route(Town target, int cost) {
        this.target = target;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return target.getTitle() + ": " + cost;
    }
}
