package Zadachnik;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine(Point... points) {
        this.points = new ArrayList<>(List.of(points));
    }

    public List<Point> getPoints() {
        return List.copyOf(points);
    }

    public void setPoints(Point... points) {
        if (points == null) {
            throw new IllegalArgumentException();
        }
        this.points = new ArrayList<>(List.of(points));
    }

    public Point getBegin() {
        return points.getFirst();
    }

    public Point getEnd() {
        return points.getLast();
    }

    public void setPoint(int idx, int x, int y) {
        this.points.get(idx).set(x, y);

    }

    @Override
    public String toString() {
        return "Линия " + points;
    }


}
