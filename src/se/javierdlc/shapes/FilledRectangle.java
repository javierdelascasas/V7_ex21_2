package se.javierdlc.shapes;

import se.javierdlc.util.Point;

import java.util.ArrayList;
import java.util.List;

public class FilledRectangle extends Rectangle {

    public FilledRectangle(Point start, Point end) {
        super(start, end);
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();
        for (int x = start.getX(); x < end.getX() + 1; x++) {
            for (int y = start.getY(); y < end.getY() + 1; y++) {
                points.add(new Point(x,y));
            }
        }
        return points;
    }
}
