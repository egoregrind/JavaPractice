package Zadachnik;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private String title;
    private List<Route> routes;

    public Town(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Город должен быть с названием");
        }
        this.title = title;
        this.routes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addRoute(Town target, int cost) {
        if (target == null) {
            throw new IllegalArgumentException("В пути не указан город назначения");
        }

        if (routes.contains(target)) {
            return;
        }

        this.routes.addLast(new Route(target, cost));
    }

    @Override
    public String toString() {
        return "Город " + title + ": " + routes;
    }
}
