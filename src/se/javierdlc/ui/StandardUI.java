package se.javierdlc.ui;

import com.googlecode.lanterna.terminal.Terminal;
import se.javierdlc.shapes.Shape;
import se.javierdlc.util.Point;

import java.util.List;

public class StandardUI implements UI {
    private Terminal terminal;

    public StandardUI(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void drawShapes(List<Shape> shapes, int zoom) {
        terminal.clearScreen();
        for (Shape shape : shapes) {
            List<Point> points = shape.draw();
            terminal.applyBackgroundColor(shape.getR(),shape.getG(),shape.getB());
            for (Point point : points) {
                terminal.moveCursor(point.getX(),point.getY());
                terminal.putCharacter(' ');
            }
        }
    }
}
