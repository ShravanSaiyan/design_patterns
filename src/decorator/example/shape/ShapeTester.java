package decorator.example.shape;

import decorator.example.shape.component.Rectangle;
import decorator.example.shape.component.Shape;
import decorator.example.shape.decorator.RedLineShapeDecorator;

public class ShapeTester {
    public static void main(String[] args) {

        Shape shape = new RedLineShapeDecorator(new Rectangle());

        shape.draw();
    }
}
