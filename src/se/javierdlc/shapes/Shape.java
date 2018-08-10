package se.javierdlc.shapes;

import se.javierdlc.util.Point;

import java.util.List;

public interface Shape {

    void setColor(int r, int g, int b);

    List<Point> draw();

    int getR();

    int getG();

    int getB();
}
