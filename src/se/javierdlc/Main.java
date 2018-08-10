package se.javierdlc;

import com.googlecode.lanterna.input.Key;
import se.javierdlc.shapes.Circle;
import se.javierdlc.shapes.FilledRectangle;
import se.javierdlc.shapes.Rectangle;
import se.javierdlc.shapes.Shape;
import se.javierdlc.ui.ZoomedUI;
import se.javierdlc.util.Point;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        InputManager inputmanager = new InputManager(window.getTerminal());
        int zoom = 1;

        Shape shape1 = new Rectangle(new Point(8, 5), new Point(15, 10));
        Shape shape2 = new Rectangle(new Point(2, 2), new Point(5, 8));
        Shape shape3 = new FilledRectangle(new Point(5, 12), new Point(20, 16));
        Shape shape4 = new Circle(new Point(60, 15), 5);

        shape1.setColor(26, 71, 255);
        shape2.setColor(26, 255, 193);
        shape3.setColor(255, 67, 39);
        shape4.setColor(255, 67, 39);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);

        ZoomedUI gui = new ZoomedUI(window.getTerminal());

        Key.Kind key;

        do {
            gui.drawShapes(shapes, zoom);
            key = inputmanager.readInput();
            if (key == Key.Kind.ArrowUp && zoom < 5) {
                zoom++;
            } else if (key == Key.Kind.ArrowDown && zoom > 1) {
                zoom--;
            }
        } while (true);
    }
}
