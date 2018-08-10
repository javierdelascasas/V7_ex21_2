package se.javierdlc.ui;

import se.javierdlc.shapes.Shape;

import java.util.List;

public interface UI {
    void drawShapes(List<Shape> shapes, int zoom);
}
