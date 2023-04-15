package decorator.example.shape.decorator;

import decorator.example.shape.component.Shape;

public class RedLineShapeDecorator extends ShapeDecorator {

    public RedLineShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added Red Line to the shape");
    }
}
