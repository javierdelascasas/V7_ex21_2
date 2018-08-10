package se.javierdlc.shapes;

import se.javierdlc.util.Point;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape {
    protected Point start;
    protected Point end;
    private int r;
    private int g;
    private int b;

    public Rectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
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
        int[] horizontal = new int[]{start.getY(),end.getY()};
        int[] vertical = new int[]{start.getX(),end.getX()};
        for(int x:vertical){
            for (int i = start.getY(); i < end.getY()+1; i++) {
                points.add(new Point(x,i));
            }
        }
        for(int y:horizontal){
            for (int i = start.getX(); i < end.getX(); i++) {
                points.add(new Point(i,y));
            }
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
