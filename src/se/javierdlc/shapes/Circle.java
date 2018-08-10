package se.javierdlc.shapes;

import se.javierdlc.util.Point;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Shape {
    protected Point origo;
    protected int radius;
    private int r;
    private int g;
    private int b;

    public Circle(Point origo, int radius) {
        this.origo = origo;
        this.radius = radius;
    }

    @Override
    public void setColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();
        for (int x = origo.getX()-radius; x < origo.getX()+radius; x++) {
            int y = (int)(origo.getY() + Math.sqrt(Math.pow(radius,2) - Math.pow(x-origo.getX(),2)));
            points.add(new Point(x,y));
            y = (int)(origo.getY() - Math.sqrt(Math.pow(radius,2) - Math.pow(x-origo.getX(),2)));
            points.add(new Point(x,y));
        }
        return points;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
