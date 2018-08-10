package se.javierdlc.ui;

import com.googlecode.lanterna.terminal.Terminal;
import se.javierdlc.shapes.Shape;
import se.javierdlc.util.Point;

import java.util.List;

public class ZoomedUI implements UI {
    private Terminal terminal;

    public ZoomedUI(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void drawShapes(List<Shape> shapes, int zoom) {
        System.out.println("Drawing");
        terminal.clearScreen();
        for (Shape shape : shapes) {
            List<Point> points = shape.draw();
            terminal.applyBackgroundColor(shape.getR(), shape.getG(), shape.getB());
            for (Point point : points) {
                int x = point.getX() * zoom;
                int y = point.getY() * zoom;
                for (int i = 0; i < zoom; i++) {
                    for (int j = 0; j < zoom; j++) {
                        terminal.moveCursor(x + i, y + j);
                        terminal.putCharacter(' ');
                    }
                }
            }
        }
    }
}
